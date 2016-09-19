<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<bean name="egovSrchwrdIdGnrService"
		class="egovframework.rte.fdl.idgnr.impl.EgovTableIdGnrService"
		destroy-method="destroy">
		<property name="dataSource" ref="egov.dataSource" />
		<property name="strategy" ref="srchwrdIdMsgtrategy" />
		<property name="blockSize" 	value="1"/>
		<property name="table"	   	value="COMTECOPSEQ"/>
		<property name="tableName"	value="SRCHWRD_ID"/>
	</bean>
	<bean name="srchwrdIdMsgtrategy"
		class="egovframework.rte.fdl.idgnr.impl.strategy.EgovIdGnrStrategyImpl">
		<property name="prefix" value="SRC_" />
		<property name="cipers" value="16" />
		<property name="fillChar" value="0" />
	</bean>