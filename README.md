# Rest api DB employee

<ul>
 <li>configuration: java based </li>
 <li>DB: MySql</li>
 <li>Server: apache-tomcat-9.0.46</li>
 </ul>

<p>
Technologies
</p>
<ol>
 <li> Spring MVC</li>
 <li> Spring REST</li>
 <li>Hibernate</li>
 <li>JSON</li>
</ol>


MySql script:

<p>

USE my_db;<br>

CREATE TABLE employees (<br>
id int NOT NULL AUTO_INCREMENT,<br>
name varchar(15),<br>
surname varchar(25),<br>
department varchar(20),<br>
salary int,<br>
PRIMARY KEY (id)<br>
) ;

</p>



