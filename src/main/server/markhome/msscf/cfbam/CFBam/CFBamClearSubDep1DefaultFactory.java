
// Description: Java 11 Default Factory implementation for ClearSubDep1.

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
	 *	CFBamClearSubDep1Factory implementation for ClearSubDep1
	 */
public class CFBamClearSubDep1DefaultFactory
	implements ICFBamClearSubDep1Factory
{
	public CFBamClearSubDep1DefaultFactory() {
	}

	public CFBamClearSubDep1ByClearTopDepIdxKey newClearTopDepIdxKey() {
		CFBamClearSubDep1ByClearTopDepIdxKey key =
			new CFBamClearSubDep1ByClearTopDepIdxKey();
		return( key );
	}

	public CFBamClearSubDep1ByUNameIdxKey newUNameIdxKey() {
		CFBamClearSubDep1ByUNameIdxKey key =
			new CFBamClearSubDep1ByUNameIdxKey();
		return( key );
	}

	public CFBamClearSubDep1Buff newBuff() {
		CFBamClearSubDep1Buff buff =
			new CFBamClearSubDep1Buff();
		return( buff );
	}

	public CFBamClearSubDep1HBuff newHBuff() {
		CFBamClearSubDep1HBuff hbuff =
			new CFBamClearSubDep1HBuff();
		return( hbuff );
	}
}
