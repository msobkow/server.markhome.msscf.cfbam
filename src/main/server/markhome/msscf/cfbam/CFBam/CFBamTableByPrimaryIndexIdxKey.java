// Description: Java 11 implementation of a Table by PrimaryIndexIdx index key object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

public class CFBamTableByPrimaryIndexIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalPrimaryIndexTenantId;
	protected Long optionalPrimaryIndexId;
	public CFBamTableByPrimaryIndexIdxKey() {
		optionalPrimaryIndexTenantId = null;
		optionalPrimaryIndexId = null;
	}

	public Long getOptionalPrimaryIndexTenantId() {
		return( optionalPrimaryIndexTenantId );
	}

	public void setOptionalPrimaryIndexTenantId( Long value ) {
		if( value == null ) {
			optionalPrimaryIndexTenantId = null;
		}
		else if( value < CFBamTableBuff.PRIMARYINDEXTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalPrimaryIndexTenantId",
				1,
				"value",
				value,
				CFBamTableBuff.PRIMARYINDEXTENANTID_MIN_VALUE );
		}
		else {
			optionalPrimaryIndexTenantId = value;
		}
	}

	public Long getOptionalPrimaryIndexId() {
		return( optionalPrimaryIndexId );
	}

	public void setOptionalPrimaryIndexId( Long value ) {
		if( value == null ) {
			optionalPrimaryIndexId = null;
		}
		else if( value < CFBamTableBuff.PRIMARYINDEXID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalPrimaryIndexId",
				1,
				"value",
				value,
				CFBamTableBuff.PRIMARYINDEXID_MIN_VALUE );
		}
		else {
			optionalPrimaryIndexId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamTableByPrimaryIndexIdxKey ) {
			CFBamTableByPrimaryIndexIdxKey rhs = (CFBamTableByPrimaryIndexIdxKey)obj;
			if( getOptionalPrimaryIndexTenantId() != null ) {
				if( rhs.getOptionalPrimaryIndexTenantId() != null ) {
					if( ! getOptionalPrimaryIndexTenantId().equals( rhs.getOptionalPrimaryIndexTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrimaryIndexTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalPrimaryIndexId() != null ) {
				if( rhs.getOptionalPrimaryIndexId() != null ) {
					if( ! getOptionalPrimaryIndexId().equals( rhs.getOptionalPrimaryIndexId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrimaryIndexId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamTableBuff ) {
			CFBamTableBuff rhs = (CFBamTableBuff)obj;
			if( getOptionalPrimaryIndexTenantId() != null ) {
				if( rhs.getOptionalPrimaryIndexTenantId() != null ) {
					if( ! getOptionalPrimaryIndexTenantId().equals( rhs.getOptionalPrimaryIndexTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrimaryIndexTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalPrimaryIndexId() != null ) {
				if( rhs.getOptionalPrimaryIndexId() != null ) {
					if( ! getOptionalPrimaryIndexId().equals( rhs.getOptionalPrimaryIndexId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrimaryIndexId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getOptionalPrimaryIndexTenantId() != null ) {
			hashCode = hashCode + getOptionalPrimaryIndexTenantId().hashCode();
		}
		if( getOptionalPrimaryIndexId() != null ) {
			hashCode = hashCode + getOptionalPrimaryIndexId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamTableByPrimaryIndexIdxKey ) {
			CFBamTableByPrimaryIndexIdxKey rhs = (CFBamTableByPrimaryIndexIdxKey)obj;
			if( getOptionalPrimaryIndexTenantId() != null ) {
				Long lhsPrimaryIndexTenantId = getOptionalPrimaryIndexTenantId();
				if( rhs.getOptionalPrimaryIndexTenantId() != null ) {
					Long rhsPrimaryIndexTenantId = rhs.getOptionalPrimaryIndexTenantId();
					int cmp = lhsPrimaryIndexTenantId.compareTo( rhsPrimaryIndexTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrimaryIndexTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalPrimaryIndexId() != null ) {
				Long lhsPrimaryIndexId = getOptionalPrimaryIndexId();
				if( rhs.getOptionalPrimaryIndexId() != null ) {
					Long rhsPrimaryIndexId = rhs.getOptionalPrimaryIndexId();
					int cmp = lhsPrimaryIndexId.compareTo( rhsPrimaryIndexId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrimaryIndexId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamTableBuff ) {
			CFBamTableBuff rhs = (CFBamTableBuff)obj;
			if( getOptionalPrimaryIndexTenantId() != null ) {
				Long lhsPrimaryIndexTenantId = getOptionalPrimaryIndexTenantId();
				if( rhs.getOptionalPrimaryIndexTenantId() != null ) {
					Long rhsPrimaryIndexTenantId = rhs.getOptionalPrimaryIndexTenantId();
					int cmp = lhsPrimaryIndexTenantId.compareTo( rhsPrimaryIndexTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrimaryIndexTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalPrimaryIndexId() != null ) {
				Long lhsPrimaryIndexId = getOptionalPrimaryIndexId();
				if( rhs.getOptionalPrimaryIndexId() != null ) {
					Long rhsPrimaryIndexId = rhs.getOptionalPrimaryIndexId();
					int cmp = lhsPrimaryIndexId.compareTo( rhsPrimaryIndexId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrimaryIndexId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFBamTableByPrimaryIndexIdx"
			+ " OptionalPrimaryIndexTenantId=" + ( ( getOptionalPrimaryIndexTenantId() == null ) ? "null" : "\"" + getOptionalPrimaryIndexTenantId().toString() + "\"" )
			+ " OptionalPrimaryIndexId=" + ( ( getOptionalPrimaryIndexId() == null ) ? "null" : "\"" + getOptionalPrimaryIndexId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
