// Description: Java 11 Object interface for CFBam PopSubDep1.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import server.markhome.msscf.cfbam.CFBam.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamPopSubDep1Obj
	extends ICFBamPopDepObj
{
	/**
	 *	Get the current edition of this PopSubDep1 instance as a ICFBamPopSubDep1EditObj.
	 *
	 *	@return	The ICFBamPopSubDep1EditObj edition of this instance.
	 */
	ICFBamPopSubDep1EditObj getEditAsPopSubDep1();

	/**
	 *	Get the ICFBamPopSubDep1TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamPopSubDep1TableObj table cache which manages this instance.
	 */
	ICFBamPopSubDep1TableObj getPopSubDep1Table();

	/**
	 *	Get the CFBamPopSubDep1Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamPopSubDep1Buff instance which currently backs this object.
	 */
	CFBamPopSubDep1Buff getPopSubDep1Buff();

	/**
	 *	Get the required long attribute PopTopDepTenantId.
	 *
	 *	@return	The required long attribute PopTopDepTenantId.
	 */
	long getRequiredPopTopDepTenantId();

	/**
	 *	Get the required long attribute PopTopDepId.
	 *
	 *	@return	The required long attribute PopTopDepId.
	 */
	long getRequiredPopTopDepId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamPopTopDepObj instance referenced by the ContPopTopDep key.
	 *
	 *	@return	The required ICFBamPopTopDepObj instance referenced by the ContPopTopDep key.
	 */
	ICFBamPopTopDepObj getRequiredContainerContPopTopDep();

	/**
	 *	Get the required ICFBamPopTopDepObj instance referenced by the ContPopTopDep key.
	 *
	 *	@return	The required ICFBamPopTopDepObj instance referenced by the ContPopTopDep key.
	 */
	ICFBamPopTopDepObj getRequiredContainerContPopTopDep( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamPopSubDep2Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep2Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep2Obj> getOptionalComponentsPopDep();

	/**
	 *	Get the array of optional ICFBamPopSubDep2Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep2Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep2Obj> getOptionalComponentsPopDep( boolean forceRead );

}
