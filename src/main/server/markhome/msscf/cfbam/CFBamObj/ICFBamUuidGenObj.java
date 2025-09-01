// Description: Java 11 Object interface for CFBam UuidGen.

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

public interface ICFBamUuidGenObj
	extends ICFBamUuidTypeObj
{
	/**
	 *	Get the current edition of this UuidGen instance as a ICFBamUuidGenEditObj.
	 *
	 *	@return	The ICFBamUuidGenEditObj edition of this instance.
	 */
	ICFBamUuidGenEditObj getEditAsUuidGen();

	/**
	 *	Get the ICFBamUuidGenTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamUuidGenTableObj table cache which manages this instance.
	 */
	ICFBamUuidGenTableObj getUuidGenTable();

	/**
	 *	Get the CFBamUuidGenBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamUuidGenBuff instance which currently backs this object.
	 */
	CFBamUuidGenBuff getUuidGenBuff();

	/**
	 *	Get the required short attribute Slice.
	 *
	 *	@return	The required short attribute Slice.
	 */
	short getRequiredSlice();

	/**
	 *	Get the required int attribute BlockSize.
	 *
	 *	@return	The required int attribute BlockSize.
	 */
	int getRequiredBlockSize();

}
