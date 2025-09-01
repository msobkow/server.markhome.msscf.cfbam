
// Description: Java 11 Default Factory implementation for StringCol.

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
	 *	CFBamStringColFactory implementation for StringCol
	 */
public class CFBamStringColDefaultFactory
	implements ICFBamStringColFactory
{
	public CFBamStringColDefaultFactory() {
	}

	public CFBamStringColByTableIdxKey newTableIdxKey() {
		CFBamStringColByTableIdxKey key =
			new CFBamStringColByTableIdxKey();
		return( key );
	}

	public CFBamStringColBuff newBuff() {
		CFBamStringColBuff buff =
			new CFBamStringColBuff();
		return( buff );
	}

	public CFBamStringColHBuff newHBuff() {
		CFBamStringColHBuff hbuff =
			new CFBamStringColHBuff();
		return( hbuff );
	}
}
