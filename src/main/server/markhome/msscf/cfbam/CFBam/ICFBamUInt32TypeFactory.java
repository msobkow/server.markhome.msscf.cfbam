
// Description: Java 11 Factory interface for UInt32Type.

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
 *	CFBamUInt32TypeFactory interface for UInt32Type
 */
public interface ICFBamUInt32TypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over UInt32Type instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt32TypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a UInt32Type instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt32TypeBuff newBuff();

	/**
	 *	Allocate a UInt32Type history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt32TypeHBuff newHBuff();

}
