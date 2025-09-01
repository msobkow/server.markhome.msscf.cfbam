
// Description: Java 11 Default Factory implementation for NmTokenType.

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
	 *	CFBamNmTokenTypeFactory implementation for NmTokenType
	 */
public class CFBamNmTokenTypeDefaultFactory
	implements ICFBamNmTokenTypeFactory
{
	public CFBamNmTokenTypeDefaultFactory() {
	}

	public CFBamNmTokenTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamNmTokenTypeBySchemaIdxKey key =
			new CFBamNmTokenTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamNmTokenTypeBuff newBuff() {
		CFBamNmTokenTypeBuff buff =
			new CFBamNmTokenTypeBuff();
		return( buff );
	}

	public CFBamNmTokenTypeHBuff newHBuff() {
		CFBamNmTokenTypeHBuff hbuff =
			new CFBamNmTokenTypeHBuff();
		return( hbuff );
	}
}
