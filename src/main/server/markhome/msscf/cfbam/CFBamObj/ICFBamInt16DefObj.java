// Description: Java 11 Object interface for CFBam Int16Def.

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

public interface ICFBamInt16DefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this Int16Def instance as a ICFBamInt16DefEditObj.
	 *
	 *	@return	The ICFBamInt16DefEditObj edition of this instance.
	 */
	ICFBamInt16DefEditObj getEditAsInt16Def();

	/**
	 *	Get the ICFBamInt16DefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamInt16DefTableObj table cache which manages this instance.
	 */
	ICFBamInt16DefTableObj getInt16DefTable();

	/**
	 *	Get the CFBamInt16DefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamInt16DefBuff instance which currently backs this object.
	 */
	CFBamInt16DefBuff getInt16DefBuff();

	/**
	 *	Get the optional Short attribute InitValue.
	 *
	 *	@return	The optional Short attribute InitValue.
	 */
	Short getOptionalInitValue();

	/**
	 *	Get the optional Short attribute MinValue.
	 *
	 *	@return	The optional Short attribute MinValue.
	 */
	Short getOptionalMinValue();

	/**
	 *	Get the optional Short attribute MaxValue.
	 *
	 *	@return	The optional Short attribute MaxValue.
	 */
	Short getOptionalMaxValue();

}
