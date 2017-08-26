'storageManager' @ [28:49] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl.<init>[ValueParameterDescriptorImpl]

'createCacheWithNullableValues' @ [28:64] ==> public abstract fun <K, V : Any> createCacheWithNullableValues(): CacheWithNullableValues<JavaClassDescriptor, SimpleType> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JavaClassDescriptor
    <V : Any> -> SimpleType

'functionTypesForSamInterfaces' @ [31:16] ==> private final val functionTypesForSamInterfaces: CacheWithNullableValues<JavaClassDescriptor, SimpleType> defined in org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl[PropertyDescriptorImpl]

'computeIfAbsent' @ [31:46] ==> public abstract fun computeIfAbsent(key: JavaClassDescriptor, computation: () -> SimpleType?): SimpleType? defined in org.jetbrains.kotlin.storage.CacheWithNullableValues[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [31:62] ==> value-parameter classDescriptor: JavaClassDescriptor defined in org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl.resolveFunctionTypeIfSamInterface[ValueParameterDescriptorImpl]

'?:' @ [32:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: FunctionDescriptor?, right: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> FunctionDescriptor

'getSingleAbstractMethodOrNull' @ [32:60] ==> @Nullable public open fun getSingleAbstractMethodOrNull(@NotNull klass: JavaClassDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'classDescriptor' @ [32:90] ==> value-parameter classDescriptor: JavaClassDescriptor defined in org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl.resolveFunctionTypeIfSamInterface[ValueParameterDescriptorImpl]

'samWithReceiverResolvers' @ [33:59] ==> private final val samWithReceiverResolvers: Iterable<SamWithReceiverResolver> defined in org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl[PropertyDescriptorImpl]

'any' @ [33:84] ==> public inline fun <T> Iterable<SamWithReceiverResolver>.any(predicate: (SamWithReceiverResolver) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SamWithReceiverResolver

'it' @ [33:90] ==> value-parameter it: SamWithReceiverResolver defined in org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl.resolveFunctionTypeIfSamInterface.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'shouldConvertFirstSamParameterToReceiver' @ [33:93] ==> public abstract fun shouldConvertFirstSamParameterToReceiver(function: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.sam.SamWithReceiverResolver[SimpleFunctionDescriptorImpl]

'abstractMethod' @ [33:134] ==> val abstractMethod: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl.resolveFunctionTypeIfSamInterface.<anonymous>[LocalVariableDescriptor]

'getFunctionTypeForAbstractMethod' @ [34:39] ==> @NotNull public open fun getFunctionTypeForAbstractMethod(@NotNull function: FunctionDescriptor, shouldConvertFirstParameterToDescriptor: Boolean): SimpleType defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'abstractMethod' @ [34:72] ==> val abstractMethod: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl.resolveFunctionTypeIfSamInterface.<anonymous>[LocalVariableDescriptor]

'shouldConvertFirstParameterToDescriptor' @ [34:88] ==> val shouldConvertFirstParameterToDescriptor: Boolean defined in org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl.resolveFunctionTypeIfSamInterface.<anonymous>[LocalVariableDescriptor]

