
// Description: Java 11 Factory interface for UInt64Type.

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
 *	CFBamUInt64TypeFactory interface for UInt64Type
 */
public interface ICFBamUInt64TypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over UInt64Type instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt64TypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a UInt64Type instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt64TypeBuff newBuff();

	/**
	 *	Allocate a UInt64Type history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt64TypeHBuff newHBuff();

}
