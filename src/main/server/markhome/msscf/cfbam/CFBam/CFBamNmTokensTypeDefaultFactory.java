
// Description: Java 11 Default Factory implementation for NmTokensType.

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
	 *	CFBamNmTokensTypeFactory implementation for NmTokensType
	 */
public class CFBamNmTokensTypeDefaultFactory
	implements ICFBamNmTokensTypeFactory
{
	public CFBamNmTokensTypeDefaultFactory() {
	}

	public CFBamNmTokensTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamNmTokensTypeBySchemaIdxKey key =
			new CFBamNmTokensTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamNmTokensTypeBuff newBuff() {
		CFBamNmTokensTypeBuff buff =
			new CFBamNmTokensTypeBuff();
		return( buff );
	}

	public CFBamNmTokensTypeHBuff newHBuff() {
		CFBamNmTokensTypeHBuff hbuff =
			new CFBamNmTokensTypeHBuff();
		return( hbuff );
	}
}
