// Description: Java 11 Object interface for CFBam DoubleDef.

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

public interface ICFBamDoubleDefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this DoubleDef instance as a ICFBamDoubleDefEditObj.
	 *
	 *	@return	The ICFBamDoubleDefEditObj edition of this instance.
	 */
	ICFBamDoubleDefEditObj getEditAsDoubleDef();

	/**
	 *	Get the ICFBamDoubleDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamDoubleDefTableObj table cache which manages this instance.
	 */
	ICFBamDoubleDefTableObj getDoubleDefTable();

	/**
	 *	Get the CFBamDoubleDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamDoubleDefBuff instance which currently backs this object.
	 */
	CFBamDoubleDefBuff getDoubleDefBuff();

	/**
	 *	Get the optional Double attribute InitValue.
	 *
	 *	@return	The optional Double attribute InitValue.
	 */
	Double getOptionalInitValue();

	/**
	 *	Get the optional Double attribute MinValue.
	 *
	 *	@return	The optional Double attribute MinValue.
	 */
	Double getOptionalMinValue();

	/**
	 *	Get the optional Double attribute MaxValue.
	 *
	 *	@return	The optional Double attribute MaxValue.
	 */
	Double getOptionalMaxValue();

}
