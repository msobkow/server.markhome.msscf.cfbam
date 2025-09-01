// Description: Java 11 implementation of a SchemaRef by RefSchemaIdx index key object.

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

public class CFBamSchemaRefByRefSchemaIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalRefSchemaTenantId;
	protected Long optionalRefSchemaId;
	public CFBamSchemaRefByRefSchemaIdxKey() {
		optionalRefSchemaTenantId = null;
		optionalRefSchemaId = null;
	}

	public Long getOptionalRefSchemaTenantId() {
		return( optionalRefSchemaTenantId );
	}

	public void setOptionalRefSchemaTenantId( Long value ) {
		if( value == null ) {
			optionalRefSchemaTenantId = null;
		}
		else if( value < CFBamSchemaRefBuff.REFSCHEMATENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalRefSchemaTenantId",
				1,
				"value",
				value,
				CFBamSchemaRefBuff.REFSCHEMATENANTID_MIN_VALUE );
		}
		else {
			optionalRefSchemaTenantId = value;
		}
	}

	public Long getOptionalRefSchemaId() {
		return( optionalRefSchemaId );
	}

	public void setOptionalRefSchemaId( Long value ) {
		if( value == null ) {
			optionalRefSchemaId = null;
		}
		else if( value < CFBamSchemaRefBuff.REFSCHEMAID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalRefSchemaId",
				1,
				"value",
				value,
				CFBamSchemaRefBuff.REFSCHEMAID_MIN_VALUE );
		}
		else {
			optionalRefSchemaId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamSchemaRefByRefSchemaIdxKey ) {
			CFBamSchemaRefByRefSchemaIdxKey rhs = (CFBamSchemaRefByRefSchemaIdxKey)obj;
			if( getOptionalRefSchemaTenantId() != null ) {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					if( ! getOptionalRefSchemaTenantId().equals( rhs.getOptionalRefSchemaTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamSchemaRefBuff ) {
			CFBamSchemaRefBuff rhs = (CFBamSchemaRefBuff)obj;
			if( getOptionalRefSchemaTenantId() != null ) {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					if( ! getOptionalRefSchemaTenantId().equals( rhs.getOptionalRefSchemaTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
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
		if( getOptionalRefSchemaTenantId() != null ) {
			hashCode = hashCode + getOptionalRefSchemaTenantId().hashCode();
		}
		if( getOptionalRefSchemaId() != null ) {
			hashCode = hashCode + getOptionalRefSchemaId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamSchemaRefByRefSchemaIdxKey ) {
			CFBamSchemaRefByRefSchemaIdxKey rhs = (CFBamSchemaRefByRefSchemaIdxKey)obj;
			if( getOptionalRefSchemaTenantId() != null ) {
				Long lhsRefSchemaTenantId = getOptionalRefSchemaTenantId();
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					Long rhsRefSchemaTenantId = rhs.getOptionalRefSchemaTenantId();
					int cmp = lhsRefSchemaTenantId.compareTo( rhsRefSchemaTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				Long lhsRefSchemaId = getOptionalRefSchemaId();
				if( rhs.getOptionalRefSchemaId() != null ) {
					Long rhsRefSchemaId = rhs.getOptionalRefSchemaId();
					int cmp = lhsRefSchemaId.compareTo( rhsRefSchemaId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamSchemaRefBuff ) {
			CFBamSchemaRefBuff rhs = (CFBamSchemaRefBuff)obj;
			if( getOptionalRefSchemaTenantId() != null ) {
				Long lhsRefSchemaTenantId = getOptionalRefSchemaTenantId();
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					Long rhsRefSchemaTenantId = rhs.getOptionalRefSchemaTenantId();
					int cmp = lhsRefSchemaTenantId.compareTo( rhsRefSchemaTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				Long lhsRefSchemaId = getOptionalRefSchemaId();
				if( rhs.getOptionalRefSchemaId() != null ) {
					Long rhsRefSchemaId = rhs.getOptionalRefSchemaId();
					int cmp = lhsRefSchemaId.compareTo( rhsRefSchemaId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
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
		String ret = "<CFBamSchemaRefByRefSchemaIdx"
			+ " OptionalRefSchemaTenantId=" + ( ( getOptionalRefSchemaTenantId() == null ) ? "null" : "\"" + getOptionalRefSchemaTenantId().toString() + "\"" )
			+ " OptionalRefSchemaId=" + ( ( getOptionalRefSchemaId() == null ) ? "null" : "\"" + getOptionalRefSchemaId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
