// Description: Java 11 Object interface for CFBam BlobDef.

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

public interface ICFBamBlobDefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this BlobDef instance as a ICFBamBlobDefEditObj.
	 *
	 *	@return	The ICFBamBlobDefEditObj edition of this instance.
	 */
	ICFBamBlobDefEditObj getEditAsBlobDef();

	/**
	 *	Get the ICFBamBlobDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamBlobDefTableObj table cache which manages this instance.
	 */
	ICFBamBlobDefTableObj getBlobDefTable();

	/**
	 *	Get the CFBamBlobDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamBlobDefBuff instance which currently backs this object.
	 */
	CFBamBlobDefBuff getBlobDefBuff();

	/**
	 *	Get the required int attribute MaxLen.
	 *
	 *	@return	The required int attribute MaxLen.
	 */
	int getRequiredMaxLen();

	/**
	 *	Get the optional byte[] attribute InitValue.
	 *
	 *	@return	The optional byte[] attribute InitValue.
	 */
	byte[] getOptionalInitValue();

}
