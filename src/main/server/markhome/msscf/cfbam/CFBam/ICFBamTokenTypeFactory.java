
// Description: Java 11 Factory interface for TokenType.

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
 *	CFBamTokenTypeFactory interface for TokenType
 */
public interface ICFBamTokenTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over TokenType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTokenTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a TokenType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTokenTypeBuff newBuff();

	/**
	 *	Allocate a TokenType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTokenTypeHBuff newHBuff();

}
