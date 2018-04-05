<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Working</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
</head>
<body >
<div class="container-fluid" style="text-align: center;">
    <div class="row" style="text-align: center;">
        <button class="col-sm-6 button8" id="b1" onclick="off('b1','Information','DataBase')"  >Отримати інформація</button>
        <button class="col-sm-6 button8" id="b2" onclick="off('b2','DataBase','Information')"  >Редактувати базу данних</button>

    </div>
</div>
<br><br>

<div id="DataBase" style="display: none;">
    <div class="container-fluid">
        <div class="row" style="text-align: center;">
            <button class="col-sm-2 button6" id="t1" onclick="off2('t1')"  >АТС</button>
            <button class="col-sm-2 button6" id="t2" onclick="off2('t2')"  >ATCType</button>
            <button class="col-sm-2 button6" id="t3" onclick="off2('t3')"  >Number</button>
            <button class="col-sm-2 button6" id="t4" onclick="off2('t4')"  >PhoneNumber</button>
            <button class="col-sm-2 button6" id="t5" onclick="off2('t5')"  >Consumer</button>
            <button class="col-sm-2 button6" id="t6" onclick="off2('t6')"  >PhoneType</button>
            <button class="col-sm-2 button6" id="t7" onclick="off2('t7')"  >PayPhone</button>
            <button class="col-sm-2 button6" id="t8" onclick="off2('t8')"  >Queue</button>
            <button class="col-sm-2 button6" id="t9" onclick="off2('t9')"  >Street</button>
            <button class="col-sm-2 button6" id="t10" onclick="off2('t10')"  >Region</button>
            <button class="col-sm-2 button6" id="t11" onclick="off2('t11')"  >Call</button>
            <button class="col-sm-2 button6" id="t12" onclick="off2('t12')"  >City</button>
        </div>
        <br>

        <div style="display: none;" id="comp1">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">ATCType</th>
                        <th scope="col">name</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${mtcList}" var="mtc">
                        <tr>
                            <th>${mtc.id}</th>
                            <td>${mtc.atcByAtcId.type}</td>
                            <td>${mtc.name}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp2">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">type</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${atcList}" var="atc">
                        <tr>
                            <th >${atc.id}</th>
                            <td>${atc.type}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp3">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">Number</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${numberList}" var="item">
                        <tr>
                            <th>${item.number}</th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp4">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">number</th>
                        <th scope="col">houseNumber</th>
                        <th scope="col">apartment</th>
                        <th scope="col">interspace</th>
                        <th scope="col">PhoneType</th>
                        <th scope="col">Street</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${phonenumberList}" var="phoneNumber">
                        <tr>
                            <th>${phoneNumber.id}</th>
                            <td>${phoneNumber.number}</td>
                            <td>${phoneNumber.houseNumber}</td>
                            <td>${phoneNumber.apartment}</td>
                            <td>${phoneNumber.interspace}</td>
                            <td>${phoneNumber.phoneByPhoneId.type}</td>
                            <td>${phoneNumber.streetByStreetId.name}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>


        <div style="display: none;" id="comp5">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">firstName</th>
                        <th scope="col">lastName</th>
                        <th scope="col">sex</th>
                        <th scope="col">age</th>
                        <th scope="col">balance</th>
                        <th scope="col">beneficiary</th>
                        <th scope="col">PhoneNumber</th>
                        <th scope="col">connected</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${consumerList}" var="consumer">
                        <tr>
                            <th>${consumer.id}</th>
                            <td>${consumer.firstName}</td>
                            <td>${consumer.lastName}</td>
                            <td>${consumer.sex}</td>
                            <td>${consumer.age}</td>
                            <td>${consumer.balance}</td>
                            <td>${consumer.beneficiary}</td>
                            <td>${consumer.phonenumberByPhoneNumberId.number}</td>
                            <td>${consumer.connected}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp6">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">type</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${phoneList}" var="phoneType">
                        <tr>
                            <th>${phoneType.id}</th>
                            <td>${phoneType.type}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp7">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">PhoneNumber</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${payphonesList}" var="payPhone">
                        <tr>
                            <th scope="row">${payPhone.id}</th>
                            <td>${payPhone.phonenumberByPhoneNumberId.numberByNumber.number}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp8">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">firstName</th>
                        <th scope="col">lastName</th>
                        <th scope="col">sex</th>
                        <th scope="col">age</th>
                        <th scope="col">Street</th>
                        <th scope="col">houseNumber</th>
                        <th scope="col">apartment</th>
                        <th scope="col">beneficiary</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${queueList}" var="queue">
                        <tr>
                            <th>${queue.id}</th>
                            <td>${queue.firstName}</td>
                            <td>${queue.lastName}</td>
                            <td>${queue.sex}</td>
                            <td>${queue.age}</td>
                            <td>${queue.streetByStreetId.name}</td>
                            <td>${queue.houseNumber}</td>
                            <td>${queue.apartment}</td>
                            <td>${queue.beneficiary}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp9">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">name</th>
                        <th scope="col">Region_id</th>
                        <th scope="col">index</th>
                        <th scope="col">channels</th>
                        <th scope="col">MTC</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${streetList}" var="street">
                        <tr>
                            <th>${street.id}</th>
                            <td>${street.name}</td>
                            <td>${street.regionByRegionId.name}</td>
                            <td>${street.index}</td>
                            <td>${street.channels}</td>
                            <td>${street.mtcByMtcId.name}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp10">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">name</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${regionList}" var="region">
                        <tr>
                            <th>${region.id}</th>
                            <td>${region.name}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp11">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">whoCallNumber</th>
                        <th scope="col">toWhomCallNumber</th>
                        <th scope="col">toWhomCallCity</th>
                        <th scope="col">toWhomCallCity</th>
                        <th scope="col">data</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${callsList}" var="item">
                        <tr>
                            <th>${item.id}</th>
                            <td>${item.whoCallNumber}</td>
                            <td>${item.toWhomCallNumber}</td>
                            <td>${item.cityByCityCodeWhoCall.name}</td>
                            <td>${item.cityByCityCodeToWhomCall.name}</td>
                            <td>${item.data.date}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div style="display: none;" id="comp12">
            <div >
                <table class="table table-sm table-dark">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">name</th>

                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${cityList}" var="item">
                        <tr>
                            <th>${item.id}</th>
                            <td>${item.name}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>


    </div>
</div>
<div id="Information" style="display: none;">
    <div class="container-fluid">
        <div class="row" style="text-align: center;">
            <button class="col-sm-2 button6" id="l1" onclick="off3('l1')"  >1</button>
            <button class="col-sm-2 button6" id="l2" onclick="off3('l2')"  >2</button>
            <button class="col-sm-2 button6" id="l3" onclick="off3('l3')"  >3</button>
            <button class="col-sm-2 button6" id="l4" onclick="off3('l4')"  >4</button>
            <button class="col-sm-2 button6" id="l5" onclick="off3('l5')"  >5</button>
            <button class="col-sm-2 button6" id="l6" onclick="off3('l6')"  >6</button>
            <button class="col-sm-2 button6" id="l7" onclick="off3('l7')"  >7</button>
            <button class="col-sm-2 button6" id="l8" onclick="off3('l8')"  >8</button>
            <button class="col-sm-2 button6" id="l9" onclick="off3('l9')"  >9</button>
            <button class="col-sm-2 button6" id="l10" onclick="off3('l10')"  >10</button>
        </div>
    </div>

    <div>
        <div style="text-align: center;">
            <input type="text" placeholder="FirstName" name="">
            <input type="text" placeholder="LastName" name="">
            <br>
            <button class="button6">click me</button>
        </div>
    </div>
    <div ng-controller="mainController">
        <div >
            <table class="table table-sm table-dark">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">FirstName</th>
                    <th scope="col">SecondName</th>
                </tr>
                </thead>
                <tbody>
                <tr ng-repeat="student in students">
                    <th scope="row">{{student.id}}</th>
                    <td>{{student.firstName}}</td>
                    <td>{{student.secondName}}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>


<script type="text/javascript" src="resources/js/temp.js"></script>
</body>
</html>