// Description: Java 11 Object interface for CFBam ClearSubDep1.

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

public interface ICFBamClearSubDep1Obj
	extends ICFBamClearDepObj
{
	/**
	 *	Get the current edition of this ClearSubDep1 instance as a ICFBamClearSubDep1EditObj.
	 *
	 *	@return	The ICFBamClearSubDep1EditObj edition of this instance.
	 */
	ICFBamClearSubDep1EditObj getEditAsClearSubDep1();

	/**
	 *	Get the ICFBamClearSubDep1TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamClearSubDep1TableObj table cache which manages this instance.
	 */
	ICFBamClearSubDep1TableObj getClearSubDep1Table();

	/**
	 *	Get the CFBamClearSubDep1Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamClearSubDep1Buff instance which currently backs this object.
	 */
	CFBamClearSubDep1Buff getClearSubDep1Buff();

	/**
	 *	Get the required long attribute ClearTopDepTenantId.
	 *
	 *	@return	The required long attribute ClearTopDepTenantId.
	 */
	long getRequiredClearTopDepTenantId();

	/**
	 *	Get the required long attribute ClearTopDepId.
	 *
	 *	@return	The required long attribute ClearTopDepId.
	 */
	long getRequiredClearTopDepId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 *
	 *	@return	The required ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 */
	ICFBamClearTopDepObj getRequiredContainerClearTopDep();

	/**
	 *	Get the required ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 *
	 *	@return	The required ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 */
	ICFBamClearTopDepObj getRequiredContainerClearTopDep( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamClearSubDep2Obj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional ICFBamClearSubDep2Obj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamClearSubDep2Obj> getOptionalComponentsClearDep();

	/**
	 *	Get the array of optional ICFBamClearSubDep2Obj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional ICFBamClearSubDep2Obj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamClearSubDep2Obj> getOptionalComponentsClearDep( boolean forceRead );

}
