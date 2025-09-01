
// Description: Java 11 Factory interface for BlobCol.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

/*
 *	CFBamBlobColFactory interface for BlobCol
 */
public interface ICFBamBlobColFactory
{

	/**
	 *	Allocate a TableIdx key over BlobCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamBlobColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a BlobCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamBlobColBuff newBuff();

	/**
	 *	Allocate a BlobCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamBlobColHBuff newHBuff();

}
