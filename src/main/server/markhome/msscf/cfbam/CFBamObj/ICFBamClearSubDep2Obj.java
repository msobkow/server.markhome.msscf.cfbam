// Description: Java 11 Object interface for CFBam ClearSubDep2.

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

public interface ICFBamClearSubDep2Obj
	extends ICFBamClearDepObj
{
	/**
	 *	Get the current edition of this ClearSubDep2 instance as a ICFBamClearSubDep2EditObj.
	 *
	 *	@return	The ICFBamClearSubDep2EditObj edition of this instance.
	 */
	ICFBamClearSubDep2EditObj getEditAsClearSubDep2();

	/**
	 *	Get the ICFBamClearSubDep2TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamClearSubDep2TableObj table cache which manages this instance.
	 */
	ICFBamClearSubDep2TableObj getClearSubDep2Table();

	/**
	 *	Get the CFBamClearSubDep2Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamClearSubDep2Buff instance which currently backs this object.
	 */
	CFBamClearSubDep2Buff getClearSubDep2Buff();

	/**
	 *	Get the required long attribute ClearSubDep1TenantId.
	 *
	 *	@return	The required long attribute ClearSubDep1TenantId.
	 */
	long getRequiredClearSubDep1TenantId();

	/**
	 *	Get the required long attribute ClearSubDep1Id.
	 *
	 *	@return	The required long attribute ClearSubDep1Id.
	 */
	long getRequiredClearSubDep1Id();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamClearSubDep1Obj instance referenced by the ClearSubDep1 key.
	 *
	 *	@return	The required ICFBamClearSubDep1Obj instance referenced by the ClearSubDep1 key.
	 */
	ICFBamClearSubDep1Obj getRequiredContainerClearSubDep1();

	/**
	 *	Get the required ICFBamClearSubDep1Obj instance referenced by the ClearSubDep1 key.
	 *
	 *	@return	The required ICFBamClearSubDep1Obj instance referenced by the ClearSubDep1 key.
	 */
	ICFBamClearSubDep1Obj getRequiredContainerClearSubDep1( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamClearSubDep3Obj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional ICFBamClearSubDep3Obj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamClearSubDep3Obj> getOptionalComponentsClearDep();

	/**
	 *	Get the array of optional ICFBamClearSubDep3Obj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional ICFBamClearSubDep3Obj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamClearSubDep3Obj> getOptionalComponentsClearDep( boolean forceRead );

}
