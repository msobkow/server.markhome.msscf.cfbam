// Description: Java 11 Object interface for CFBam ServerListFunc.

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

public interface ICFBamServerListFuncObj
	extends ICFBamServerMethodObj
{
	/**
	 *	Get the current edition of this ServerListFunc instance as a ICFBamServerListFuncEditObj.
	 *
	 *	@return	The ICFBamServerListFuncEditObj edition of this instance.
	 */
	ICFBamServerListFuncEditObj getEditAsServerListFunc();

	/**
	 *	Get the ICFBamServerListFuncTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamServerListFuncTableObj table cache which manages this instance.
	 */
	ICFBamServerListFuncTableObj getServerListFuncTable();

	/**
	 *	Get the CFBamServerListFuncBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamServerListFuncBuff instance which currently backs this object.
	 */
	CFBamServerListFuncBuff getServerListFuncBuff();

	/**
	 *	Get the optional Long attribute RetTenantId.
	 *
	 *	@return	The optional Long attribute RetTenantId.
	 */
	Long getOptionalRetTenantId();

	/**
	 *	Get the optional Long attribute RetTableId.
	 *
	 *	@return	The optional Long attribute RetTableId.
	 */
	Long getOptionalRetTableId();

	/**
	 *	Get the optional ICFBamTableObj instance referenced by the RetTable key.
	 *
	 *	@return	The optional ICFBamTableObj instance referenced by the RetTable key.
	 */
	ICFBamTableObj getOptionalLookupRetTable();

	/**
	 *	Get the optional ICFBamTableObj instance referenced by the RetTable key.
	 *
	 *	@return	The optional ICFBamTableObj instance referenced by the RetTable key.
	 */
	ICFBamTableObj getOptionalLookupRetTable( boolean forceRead );

}
