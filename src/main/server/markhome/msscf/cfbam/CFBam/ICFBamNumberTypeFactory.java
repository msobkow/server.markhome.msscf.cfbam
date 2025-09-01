
// Description: Java 11 Factory interface for NumberType.

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
 *	CFBamNumberTypeFactory interface for NumberType
 */
public interface ICFBamNumberTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over NumberType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamNumberTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a NumberType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNumberTypeBuff newBuff();

	/**
	 *	Allocate a NumberType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNumberTypeHBuff newHBuff();

}
