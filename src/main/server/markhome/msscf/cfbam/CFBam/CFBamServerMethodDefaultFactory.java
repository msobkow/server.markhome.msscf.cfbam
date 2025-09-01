
// Description: Java 11 Default Factory implementation for ServerMethod.

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
	 *	CFBamServerMethodFactory implementation for ServerMethod
	 */
public class CFBamServerMethodDefaultFactory
	implements ICFBamServerMethodFactory
{
	public CFBamServerMethodDefaultFactory() {
	}

	public CFBamServerMethodByUNameIdxKey newUNameIdxKey() {
		CFBamServerMethodByUNameIdxKey key =
			new CFBamServerMethodByUNameIdxKey();
		return( key );
	}

	public CFBamServerMethodByMethTableIdxKey newMethTableIdxKey() {
		CFBamServerMethodByMethTableIdxKey key =
			new CFBamServerMethodByMethTableIdxKey();
		return( key );
	}

	public CFBamServerMethodByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamServerMethodByDefSchemaIdxKey key =
			new CFBamServerMethodByDefSchemaIdxKey();
		return( key );
	}

	public CFBamServerMethodBuff newBuff() {
		CFBamServerMethodBuff buff =
			new CFBamServerMethodBuff();
		return( buff );
	}

	public CFBamServerMethodHBuff newHBuff() {
		CFBamServerMethodHBuff hbuff =
			new CFBamServerMethodHBuff();
		return( hbuff );
	}
}
