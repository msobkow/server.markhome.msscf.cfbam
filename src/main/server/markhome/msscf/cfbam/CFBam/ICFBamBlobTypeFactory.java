
// Description: Java 11 Factory interface for BlobType.

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
 *	CFBamBlobTypeFactory interface for BlobType
 */
public interface ICFBamBlobTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over BlobType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamBlobTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a BlobType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamBlobTypeBuff newBuff();

	/**
	 *	Allocate a BlobType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamBlobTypeHBuff newHBuff();

}
