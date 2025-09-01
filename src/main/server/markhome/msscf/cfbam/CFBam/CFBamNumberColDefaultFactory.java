
// Description: Java 11 Default Factory implementation for NumberCol.

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
	 *	CFBamNumberColFactory implementation for NumberCol
	 */
public class CFBamNumberColDefaultFactory
	implements ICFBamNumberColFactory
{
	public CFBamNumberColDefaultFactory() {
	}

	public CFBamNumberColByTableIdxKey newTableIdxKey() {
		CFBamNumberColByTableIdxKey key =
			new CFBamNumberColByTableIdxKey();
		return( key );
	}

	public CFBamNumberColBuff newBuff() {
		CFBamNumberColBuff buff =
			new CFBamNumberColBuff();
		return( buff );
	}

	public CFBamNumberColHBuff newHBuff() {
		CFBamNumberColHBuff hbuff =
			new CFBamNumberColHBuff();
		return( hbuff );
	}
}
