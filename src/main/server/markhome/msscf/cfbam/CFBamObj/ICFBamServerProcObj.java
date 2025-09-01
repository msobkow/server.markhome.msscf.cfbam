// Description: Java 11 Object interface for CFBam ServerProc.

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

public interface ICFBamServerProcObj
	extends ICFBamServerMethodObj
{
	/**
	 *	Get the current edition of this ServerProc instance as a ICFBamServerProcEditObj.
	 *
	 *	@return	The ICFBamServerProcEditObj edition of this instance.
	 */
	ICFBamServerProcEditObj getEditAsServerProc();

	/**
	 *	Get the ICFBamServerProcTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamServerProcTableObj table cache which manages this instance.
	 */
	ICFBamServerProcTableObj getServerProcTable();

	/**
	 *	Get the CFBamServerProcBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamServerProcBuff instance which currently backs this object.
	 */
	CFBamServerProcBuff getServerProcBuff();

	/**
	 *	Get the optional String attribute Dummy.
	 *
	 *	@return	The optional String attribute Dummy.
	 */
	String getOptionalDummy();

}
