<%--
  Created by IntelliJ IDEA.
  User: zhangsx
  Date: 15/8/18
  Time: 下午8:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
  <script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
  <link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
  <script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
  <div class="row-fluid">
    <div class="span12">
      <div class="tabbable"> <!-- Only required for left/right tabs -->
        <ul class="nav nav-tabs">
          <li class="active"><a href="#tab1" data-toggle="tab">Section 1</a></li>
          <li><a href="#tab2" data-toggle="tab">Section 2</a></li>
        </ul>
        <div class="tab-content">
          <div class="tab-pane active" id="tab1">
            <p>I'm in Section 1.</p>
          </div>
          <div class="tab-pane" id="tab2">
            <p>Howdy, I'm in Section 2.</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</div>
<div class="row-fluid">
  <div class="span12">
    <table class="table">
      <thead>
      <tr>
        <th>
          no
        </th>
        <th>
          pro
        </th>
        <th>
          time
        </th>
        <th>
          state
        </th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td>
          1
        </td>
        <td>
          TB - Monthly
        </td>
        <td>
          01/04/2012
        </td>
        <td>
          <button class="btn btn-mini" type="button">add</button>
          <button class="btn btn-mini" type="button">edit</button>
          <button class="btn btn-mini" type="button">del</button>
        </td>
      </tr>
      <tr class="success">
        <td>
          1
        </td>
        <td>
          TB - Monthly
        </td>
        <td>
          01/04/2012
        </td>
        <td>
          <button class="btn btn-mini" type="button">add</button>
          <button class="btn btn-mini" type="button">edit</button>
          <button class="btn btn-mini" type="button">del</button>
        </td>
      </tr>
      <tr class="error">
        <td>
          2
        </td>
        <td>
          TB - Monthly
        </td>
        <td>
          02/04/2012
        </td>
        <td>
          <button class="btn btn-mini" type="button">add</button>
          <button class="btn btn-mini" type="button">edit</button>
          <button class="btn btn-mini" type="button">del</button>
        </td>
      </tr>
      <tr class="warning">
        <td>
          3
        </td>
        <td>
          TB - Monthly
        </td>
        <td>
          03/04/2012
        </td>
        <td>
          <button class="btn btn-mini" type="button">add</button>
          <button class="btn btn-mini" type="button">edit</button>
          <button class="btn btn-mini" type="button">del</button>
        </td>
      </tr>
      <tr class="info">
        <td>
          4
        </td>
        <td>
          TB - Monthly
        </td>
        <td>
          04/04/2012
        </td>
        <td>
          <button class="btn btn-mini" type="button">add</button>
          <button class="btn btn-mini" type="button">edit</button>
          <button class="btn btn-mini" type="button">del</button>
        </td>
      </tr>
      </tbody>
    </table>
    <div class="pagination">
      <ul>
        <li>
          <a href="#"><</a>
        </li>
        <li>
          <a href="#">1</a>
        </li>
        <li>
          <a href="#">2</a>
        </li>
        <li>
          <a href="#">3</a>
        </li>
        <li>
          <a href="#">4</a>
        </li>
        <li>
          <a href="#">5</a>
        </li>
        <li>
          <a href="#">></a>
        </li>
      </ul>
    </div>
  </div>
</div>
</div>
</body>
</html>

