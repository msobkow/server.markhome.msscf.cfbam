// Description: Java 11 Object interface for CFBam DelSubDep1.

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

public interface ICFBamDelSubDep1Obj
	extends ICFBamDelDepObj
{
	/**
	 *	Get the current edition of this DelSubDep1 instance as a ICFBamDelSubDep1EditObj.
	 *
	 *	@return	The ICFBamDelSubDep1EditObj edition of this instance.
	 */
	ICFBamDelSubDep1EditObj getEditAsDelSubDep1();

	/**
	 *	Get the ICFBamDelSubDep1TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamDelSubDep1TableObj table cache which manages this instance.
	 */
	ICFBamDelSubDep1TableObj getDelSubDep1Table();

	/**
	 *	Get the CFBamDelSubDep1Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamDelSubDep1Buff instance which currently backs this object.
	 */
	CFBamDelSubDep1Buff getDelSubDep1Buff();

	/**
	 *	Get the required long attribute DelTopDepTenantId.
	 *
	 *	@return	The required long attribute DelTopDepTenantId.
	 */
	long getRequiredDelTopDepTenantId();

	/**
	 *	Get the required long attribute DelTopDepId.
	 *
	 *	@return	The required long attribute DelTopDepId.
	 */
	long getRequiredDelTopDepId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamDelTopDepObj instance referenced by the DelTopDep key.
	 *
	 *	@return	The required ICFBamDelTopDepObj instance referenced by the DelTopDep key.
	 */
	ICFBamDelTopDepObj getRequiredContainerDelTopDep();

	/**
	 *	Get the required ICFBamDelTopDepObj instance referenced by the DelTopDep key.
	 *
	 *	@return	The required ICFBamDelTopDepObj instance referenced by the DelTopDep key.
	 */
	ICFBamDelTopDepObj getRequiredContainerDelTopDep( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamDelSubDep2Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional ICFBamDelSubDep2Obj[] array of instances referenced by the DelDep key.
	 */
	List<ICFBamDelSubDep2Obj> getOptionalComponentsDelDep();

	/**
	 *	Get the array of optional ICFBamDelSubDep2Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional ICFBamDelSubDep2Obj[] array of instances referenced by the DelDep key.
	 */
	List<ICFBamDelSubDep2Obj> getOptionalComponentsDelDep( boolean forceRead );

}
