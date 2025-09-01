
// Description: Java 11 Default Factory implementation for NumberType.

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
	 *	CFBamNumberTypeFactory implementation for NumberType
	 */
public class CFBamNumberTypeDefaultFactory
	implements ICFBamNumberTypeFactory
{
	public CFBamNumberTypeDefaultFactory() {
	}

	public CFBamNumberTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamNumberTypeBySchemaIdxKey key =
			new CFBamNumberTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamNumberTypeBuff newBuff() {
		CFBamNumberTypeBuff buff =
			new CFBamNumberTypeBuff();
		return( buff );
	}

	public CFBamNumberTypeHBuff newHBuff() {
		CFBamNumberTypeHBuff hbuff =
			new CFBamNumberTypeHBuff();
		return( hbuff );
	}
}
