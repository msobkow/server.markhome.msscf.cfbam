// Description: Java 11 implementation of a CFBam schema pool.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

public class CFBamSchemaPool
extends CFSecSchemaPool
{

	public CFBamSchemaPool() {
		super();
	}

	public static void setSchemaPool( CFSecSchemaPool pool ) {
		if( schemaPool == null ) {
			schemaPool = pool;
		}

	}

	public void setConfigurationFile( CFSecConfigurationFile value ) {
		
		configFile = value;
	}

}
