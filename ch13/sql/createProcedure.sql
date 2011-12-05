CREATE PROCEDURE sp_totalmoney
	@cn_id CHAR(10), 
	@new_totalmoney FLOAT OUTPUT 
AS
BEGIN
	SET @new_totalmoney = (
		SELECT totalmoney
		FROM dbuser.consumer
		WHERE id = @cn_id
	)

	SET @new_totalmoney = @new_totalmoney*0.8

	UPDATE dbuser.consumer
	SET totalmoney = @new_totalmoney
	WHERE id= @cn_id
END
GO
