// Description: Java 11 Object interface for CFBam ClearSubDep3.

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

public interface ICFBamClearSubDep3Obj
	extends ICFBamClearDepObj
{
	/**
	 *	Get the current edition of this ClearSubDep3 instance as a ICFBamClearSubDep3EditObj.
	 *
	 *	@return	The ICFBamClearSubDep3EditObj edition of this instance.
	 */
	ICFBamClearSubDep3EditObj getEditAsClearSubDep3();

	/**
	 *	Get the ICFBamClearSubDep3TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamClearSubDep3TableObj table cache which manages this instance.
	 */
	ICFBamClearSubDep3TableObj getClearSubDep3Table();

	/**
	 *	Get the CFBamClearSubDep3Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamClearSubDep3Buff instance which currently backs this object.
	 */
	CFBamClearSubDep3Buff getClearSubDep3Buff();

	/**
	 *	Get the required long attribute ClearSubDep2TenantId.
	 *
	 *	@return	The required long attribute ClearSubDep2TenantId.
	 */
	long getRequiredClearSubDep2TenantId();

	/**
	 *	Get the required long attribute ClearSubDep2Id.
	 *
	 *	@return	The required long attribute ClearSubDep2Id.
	 */
	long getRequiredClearSubDep2Id();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamClearSubDep2Obj instance referenced by the ClearSubDep2 key.
	 *
	 *	@return	The required ICFBamClearSubDep2Obj instance referenced by the ClearSubDep2 key.
	 */
	ICFBamClearSubDep2Obj getRequiredContainerClearSubDep2();

	/**
	 *	Get the required ICFBamClearSubDep2Obj instance referenced by the ClearSubDep2 key.
	 *
	 *	@return	The required ICFBamClearSubDep2Obj instance referenced by the ClearSubDep2 key.
	 */
	ICFBamClearSubDep2Obj getRequiredContainerClearSubDep2( boolean forceRead );

}
