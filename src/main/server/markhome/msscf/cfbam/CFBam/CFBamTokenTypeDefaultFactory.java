
// Description: Java 11 Default Factory implementation for TokenType.

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
	 *	CFBamTokenTypeFactory implementation for TokenType
	 */
public class CFBamTokenTypeDefaultFactory
	implements ICFBamTokenTypeFactory
{
	public CFBamTokenTypeDefaultFactory() {
	}

	public CFBamTokenTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamTokenTypeBySchemaIdxKey key =
			new CFBamTokenTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamTokenTypeBuff newBuff() {
		CFBamTokenTypeBuff buff =
			new CFBamTokenTypeBuff();
		return( buff );
	}

	public CFBamTokenTypeHBuff newHBuff() {
		CFBamTokenTypeHBuff hbuff =
			new CFBamTokenTypeHBuff();
		return( hbuff );
	}
}
