<?php

require_once('db_connect.php');

if ($con->connect_error) {
    die("Connection failed: ");
} 


$sql = "select * from person";
$result = mysqli_query($con,$sql);
$response=array();


	while($row = mysqli_fetch_array($result)){
		array_push($response, array('name'=>$row['name'],'email'=>$row['email']));
	}
	
    echo json_encode($response);


