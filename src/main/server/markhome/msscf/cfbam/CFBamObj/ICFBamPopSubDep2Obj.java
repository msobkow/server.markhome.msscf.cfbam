// Description: Java 11 Object interface for CFBam PopSubDep2.

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

public interface ICFBamPopSubDep2Obj
	extends ICFBamPopDepObj
{
	/**
	 *	Get the current edition of this PopSubDep2 instance as a ICFBamPopSubDep2EditObj.
	 *
	 *	@return	The ICFBamPopSubDep2EditObj edition of this instance.
	 */
	ICFBamPopSubDep2EditObj getEditAsPopSubDep2();

	/**
	 *	Get the ICFBamPopSubDep2TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamPopSubDep2TableObj table cache which manages this instance.
	 */
	ICFBamPopSubDep2TableObj getPopSubDep2Table();

	/**
	 *	Get the CFBamPopSubDep2Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamPopSubDep2Buff instance which currently backs this object.
	 */
	CFBamPopSubDep2Buff getPopSubDep2Buff();

	/**
	 *	Get the required long attribute PopSubDep1TenantId.
	 *
	 *	@return	The required long attribute PopSubDep1TenantId.
	 */
	long getRequiredPopSubDep1TenantId();

	/**
	 *	Get the required long attribute PopSubDep1Id.
	 *
	 *	@return	The required long attribute PopSubDep1Id.
	 */
	long getRequiredPopSubDep1Id();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamPopSubDep1Obj instance referenced by the PopSubDep1 key.
	 *
	 *	@return	The required ICFBamPopSubDep1Obj instance referenced by the PopSubDep1 key.
	 */
	ICFBamPopSubDep1Obj getRequiredContainerPopSubDep1();

	/**
	 *	Get the required ICFBamPopSubDep1Obj instance referenced by the PopSubDep1 key.
	 *
	 *	@return	The required ICFBamPopSubDep1Obj instance referenced by the PopSubDep1 key.
	 */
	ICFBamPopSubDep1Obj getRequiredContainerPopSubDep1( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamPopSubDep3Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep3Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep3Obj> getOptionalComponentsPopDep();

	/**
	 *	Get the array of optional ICFBamPopSubDep3Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep3Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep3Obj> getOptionalComponentsPopDep( boolean forceRead );

}
