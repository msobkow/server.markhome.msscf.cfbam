
// Description: Java 11 Factory interface for Id32Gen.

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
 *	CFBamId32GenFactory interface for Id32Gen
 */
public interface ICFBamId32GenFactory
{

	/**
	 *	Allocate a DispIdx key over Id32Gen instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamId32GenByDispIdxKey newDispIdxKey();

	/**
	 *	Allocate a Id32Gen instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamId32GenBuff newBuff();

	/**
	 *	Allocate a Id32Gen history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamId32GenHBuff newHBuff();

}
