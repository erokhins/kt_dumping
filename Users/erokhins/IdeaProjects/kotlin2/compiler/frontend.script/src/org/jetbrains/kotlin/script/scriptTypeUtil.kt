'template' @ [36:9] ==> public final val template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'primaryConstructor' @ [36:18] ==> @SinceKotlin public val <T : Any> KClass<out Any>.primaryConstructor: KFunction<Any>? defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'parameters' @ [36:38] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'map' @ [37:19] ==> public inline fun <T, R> Iterable<KParameter>.map(transform: (KParameter) -> ScriptParameter): List<ScriptParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter
    <R> -> ScriptParameter

'ScriptParameter' @ [37:25] ==> public constructor ScriptParameter(name: Name, type: KotlinType) defined in org.jetbrains.kotlin.script.ScriptParameter[DeserializedClassConstructorDescriptor]

'identifier' @ [37:46] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [37:57] ==> value-parameter it: KParameter defined in org.jetbrains.kotlin.script.getScriptParameters.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [37:60] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'getKotlinTypeByKType' @ [37:69] ==> private fun getKotlinTypeByKType(scriptDescriptor: ScriptDescriptor, kType: KType): KotlinType defined in org.jetbrains.kotlin.script in file scriptTypeUtil.kt[SimpleFunctionDescriptorImpl]

'scriptDescriptor' @ [37:90] ==> value-parameter scriptDescriptor: ScriptDescriptor defined in org.jetbrains.kotlin.script.getScriptParameters[ValueParameterDescriptorImpl]

'it' @ [37:108] ==> value-parameter it: KParameter defined in org.jetbrains.kotlin.script.getScriptParameters.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [37:111] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'emptyList' @ [38:12] ==> public fun <T> emptyList(): List<ScriptParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptParameter

'getKotlinTypeByFqName' @ [41:9] ==> private fun getKotlinTypeByFqName(scriptDescriptor: ScriptDescriptor, fqName: String): KotlinType defined in org.jetbrains.kotlin.script in file scriptTypeUtil.kt[SimpleFunctionDescriptorImpl]

'scriptDescriptor' @ [41:31] ==> value-parameter scriptDescriptor: ScriptDescriptor defined in org.jetbrains.kotlin.script.getKotlinTypeByKClass[ValueParameterDescriptorImpl]

'kClass' @ [42:31] ==> value-parameter kClass: KClass<out Any> defined in org.jetbrains.kotlin.script.getKotlinTypeByKClass[ValueParameterDescriptorImpl]

'qualifiedName' @ [42:38] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'RuntimeException' @ [42:61] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'kClass' @ [42:100] ==> value-parameter kClass: KClass<out Any> defined in org.jetbrains.kotlin.script.getKotlinTypeByKClass[ValueParameterDescriptorImpl]

'scriptDescriptor' @ [45:9] ==> value-parameter scriptDescriptor: ScriptDescriptor defined in org.jetbrains.kotlin.script.getKotlinTypeByFqName[ValueParameterDescriptorImpl]

'module' @ [45:26] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'findNonGenericClassAcrossDependencies' @ [45:33] ==> public fun ModuleDescriptor.findNonGenericClassAcrossDependencies(classId: ClassId, notFoundClasses: NotFoundClasses): ClassDescriptor defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'topLevel' @ [46:25] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FqName' @ [46:34] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'fqName' @ [46:41] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.script.getKotlinTypeByFqName[ValueParameterDescriptorImpl]

'NotFoundClasses' @ [47:17] ==> public constructor NotFoundClasses(storageManager: StorageManager, module: ModuleDescriptor) defined in org.jetbrains.kotlin.descriptors.NotFoundClasses[DeserializedClassConstructorDescriptor]

'NO_LOCKS' @ [47:57] ==> public final val NO_LOCKS: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaPropertyDescriptor]

'scriptDescriptor' @ [47:67] ==> value-parameter scriptDescriptor: ScriptDescriptor defined in org.jetbrains.kotlin.script.getKotlinTypeByFqName[ValueParameterDescriptorImpl]

'module' @ [47:84] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'defaultType' @ [48:11] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'kType' @ [54:22] ==> value-parameter kType: KType defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[ValueParameterDescriptorImpl]

'classifier' @ [54:28] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'classifier' @ [55:9] ==> val classifier: KClassifier? defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[LocalVariableDescriptor]

'UnsupportedOperationException' @ [56:25] ==> public constructor UnsupportedOperationException(p0: (String..String?)) defined in java.lang.UnsupportedOperationException[JavaClassConstructorDescriptor]

'classifier' @ [56:118] ==> val classifier: KClassifier? defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[LocalVariableDescriptor]

'getKotlinTypeByKClass' @ [58:16] ==> public fun getKotlinTypeByKClass(scriptDescriptor: ScriptDescriptor, kClass: KClass<out Any>): KotlinType defined in org.jetbrains.kotlin.script[SimpleFunctionDescriptorImpl]

'scriptDescriptor' @ [58:38] ==> value-parameter scriptDescriptor: ScriptDescriptor defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[ValueParameterDescriptorImpl]

'classifier' @ [58:56] ==> val classifier: KClassifier? defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[LocalVariableDescriptor]

'kType' @ [59:27] ==> value-parameter kType: KType defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[ValueParameterDescriptorImpl]

'arguments' @ [59:33] ==> @SinceKotlin public abstract val arguments: List<KTypeProjection> defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'map' @ [59:43] ==> public inline fun <T, R> Iterable<KTypeProjection>.map(transform: (KTypeProjection) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KTypeProjection
    <R> -> TypeProjection

'getTypeProjection' @ [59:49] ==> private fun getTypeProjection(scriptDescriptor: ScriptDescriptor, kTypeProjection: KTypeProjection): TypeProjection defined in org.jetbrains.kotlin.script in file scriptTypeUtil.kt[SimpleFunctionDescriptorImpl]

'scriptDescriptor' @ [59:67] ==> value-parameter scriptDescriptor: ScriptDescriptor defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[ValueParameterDescriptorImpl]

'it' @ [59:85] ==> value-parameter it: KTypeProjection defined in org.jetbrains.kotlin.script.getKotlinTypeByKType.<anonymous>[ValueParameterDescriptorImpl]

'kType' @ [60:22] ==> value-parameter kType: KType defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [60:28] ==> public abstract val isMarkedNullable: Boolean defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'KotlinTypeFactory' @ [62:12] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [62:30] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'Annotations' @ [62:41] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [62:53] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'type' @ [62:60] ==> val type: KotlinType defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[LocalVariableDescriptor]

'constructor' @ [62:65] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'typeProjections' @ [62:78] ==> val typeProjections: List<TypeProjection> defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[LocalVariableDescriptor]

'isNullable' @ [62:95] ==> val isNullable: Boolean defined in org.jetbrains.kotlin.script.getKotlinTypeByKType[LocalVariableDescriptor]

'kTypeProjection' @ [66:17] ==> value-parameter kTypeProjection: KTypeProjection defined in org.jetbrains.kotlin.script.getTypeProjection[ValueParameterDescriptorImpl]

'type' @ [66:33] ==> public final val type: KType? defined in kotlin.reflect.KTypeProjection[DeserializedPropertyDescriptor]

'UnsupportedOperationException' @ [66:57] ==> public constructor UnsupportedOperationException(p0: (String..String?)) defined in java.lang.UnsupportedOperationException[JavaClassConstructorDescriptor]

'getKotlinTypeByKType' @ [68:16] ==> private fun getKotlinTypeByKType(scriptDescriptor: ScriptDescriptor, kType: KType): KotlinType defined in org.jetbrains.kotlin.script in file scriptTypeUtil.kt[SimpleFunctionDescriptorImpl]

'scriptDescriptor' @ [68:37] ==> value-parameter scriptDescriptor: ScriptDescriptor defined in org.jetbrains.kotlin.script.getTypeProjection[ValueParameterDescriptorImpl]

'kType' @ [68:55] ==> val kType: KType defined in org.jetbrains.kotlin.script.getTypeProjection[LocalVariableDescriptor]

'when (kTypeProjection.variance) {
        KVariance.IN -> Variance.IN_VARIANCE
        KVariance.OUT -> Variance.OUT_VARIANCE
        KVariance.INVARIANT -> Variance.INVARIANT
        null -> throw java.lang.UnsupportedOperationException("Star projections are not supported")
    }' @ [70:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Variance, entry1: Variance, entry2: Variance, entry3: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Variance

'kTypeProjection' @ [70:26] ==> value-parameter kTypeProjection: KTypeProjection defined in org.jetbrains.kotlin.script.getTypeProjection[ValueParameterDescriptorImpl]

'variance' @ [70:42] ==> public final val variance: KVariance? defined in kotlin.reflect.KTypeProjection[DeserializedPropertyDescriptor]

'IN' @ [71:19] ==> enum entry IN defined in kotlin.reflect.KVariance[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [71:34] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT' @ [72:19] ==> enum entry OUT defined in kotlin.reflect.KVariance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [72:35] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'INVARIANT' @ [73:19] ==> enum entry INVARIANT defined in kotlin.reflect.KVariance[FakeCallableDescriptorForObject]

'INVARIANT' @ [73:41] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [74:33] ==> public constructor UnsupportedOperationException(p0: (String..String?)) defined in java.lang.UnsupportedOperationException[JavaClassConstructorDescriptor]

'TypeProjectionImpl' @ [77:12] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'variance' @ [77:31] ==> val variance: Variance defined in org.jetbrains.kotlin.script.getTypeProjection[LocalVariableDescriptor]

'type' @ [77:41] ==> val type: KotlinType defined in org.jetbrains.kotlin.script.getTypeProjection[LocalVariableDescriptor]

