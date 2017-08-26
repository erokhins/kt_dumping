'KDeclarationContainerImpl' @ [42:69] ==> public constructor KDeclarationContainerImpl() defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[ClassConstructorDescriptorImpl]

'KDeclarationContainerImpl.Data' @ [43:24] ==> public constructor Data() defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data[ClassConstructorDescriptorImpl]

'getValue' @ [44:44] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [44:62] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (ClassDescriptor..ClassDescriptor?)): ReflectProperties.LazySoftVal<(ClassDescriptor..ClassDescriptor?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'classId' @ [45:27] ==> private final val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'invoke' @ [46:30] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'moduleData' @ [46:37] ==> public final val moduleData: RuntimeModuleData defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'if (classId.isLocal) moduleData.deserialization.deserializeClass(classId)
                    else moduleData.module.findClassAcrossModuleDependencies(classId)' @ [49:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'classId' @ [49:25] ==> val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl.Data.descriptor.<anonymous>[LocalVariableDescriptor]

'isLocal' @ [49:33] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'moduleData' @ [49:42] ==> val moduleData: RuntimeModuleData defined in kotlin.reflect.jvm.internal.KClassImpl.Data.descriptor.<anonymous>[LocalVariableDescriptor]

'deserialization' @ [49:53] ==> public final val deserialization: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[PropertyDescriptorImpl]

'deserializeClass' @ [49:69] ==> public final fun deserializeClass(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[SimpleFunctionDescriptorImpl]

'classId' @ [49:86] ==> val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl.Data.descriptor.<anonymous>[LocalVariableDescriptor]

'moduleData' @ [50:26] ==> val moduleData: RuntimeModuleData defined in kotlin.reflect.jvm.internal.KClassImpl.Data.descriptor.<anonymous>[LocalVariableDescriptor]

'module' @ [50:37] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[PropertyDescriptorImpl]

'findClassAcrossModuleDependencies' @ [50:44] ==> public fun ModuleDescriptor.findClassAcrossModuleDependencies(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors in file findClassInModule.kt[SimpleFunctionDescriptorImpl]

'classId' @ [50:78] ==> val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl.Data.descriptor.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [52:13] ==> val descriptor: ClassDescriptor? defined in kotlin.reflect.jvm.internal.KClassImpl.Data.descriptor.<anonymous>[LocalVariableDescriptor]

'reportUnresolvedClass' @ [52:27] ==> private final fun reportUnresolvedClass(): Nothing defined in kotlin.reflect.jvm.internal.KClassImpl[SimpleFunctionDescriptorImpl]

'getValue' @ [55:46] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [55:64] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<Annotation>..List<Annotation>?)): ReflectProperties.LazySoftVal<(List<Annotation>..List<Annotation>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.Annotation>..kotlin.collections.List<kotlin.Annotation>?)

'descriptor' @ [55:75] ==> public final val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'computeAnnotations' @ [55:86] ==> internal fun Annotated.computeAnnotations(): List<Annotation> defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'getValue' @ [57:36] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [57:54] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> String?): ReflectProperties.LazySoftVal<String?> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String?

'jClass' @ [58:17] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'isAnonymousClass' @ [58:24] ==> public final val <T : (Any..Any?)> Class<T>.isAnonymousClass: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'classId' @ [60:27] ==> private final val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'when {
                classId.isLocal -> calculateLocalClassName(jClass)
                else -> classId.shortClassName.asString()
            }' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'classId' @ [62:17] ==> val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl.Data.simpleName.<anonymous>[LocalVariableDescriptor]

'isLocal' @ [62:25] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'calculateLocalClassName' @ [62:36] ==> private final fun calculateLocalClassName(jClass: Class<*>): String defined in kotlin.reflect.jvm.internal.KClassImpl.Data[SimpleFunctionDescriptorImpl]

'jClass' @ [62:60] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'classId' @ [63:25] ==> val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl.Data.simpleName.<anonymous>[LocalVariableDescriptor]

'shortClassName' @ [63:33] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

'asString' @ [63:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'getValue' @ [67:39] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): String? defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [67:57] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> String?): ReflectProperties.LazySoftVal<String?> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String?

'jClass' @ [68:17] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'isAnonymousClass' @ [68:24] ==> public final val <T : (Any..Any?)> Class<T>.isAnonymousClass: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'classId' @ [70:27] ==> private final val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'when {
                classId.isLocal -> null
                else -> classId.asSingleFqName().asString()
            }' @ [71:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'classId' @ [72:17] ==> val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl.Data.qualifiedName.<anonymous>[LocalVariableDescriptor]

'isLocal' @ [72:25] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'classId' @ [73:25] ==> val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl.Data.qualifiedName.<anonymous>[LocalVariableDescriptor]

'asSingleFqName' @ [73:33] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'asString' @ [73:50] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'jClass' @ [78:24] ==> value-parameter jClass: Class<*> defined in kotlin.reflect.jvm.internal.KClassImpl.Data.calculateLocalClassName[ValueParameterDescriptorImpl]

'simpleName' @ [78:31] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'jClass' @ [79:13] ==> value-parameter jClass: Class<*> defined in kotlin.reflect.jvm.internal.KClassImpl.Data.calculateLocalClassName[ValueParameterDescriptorImpl]

'enclosingMethod' @ [79:20] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.enclosingMethod: (Method..Method?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'let' @ [79:37] ==> @InlineOnly public inline fun <T, R> Method.let(block: (Method) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Method
    <R> -> Nothing

'name' @ [80:24] ==> val name: (String..String?) defined in kotlin.reflect.jvm.internal.KClassImpl.Data.calculateLocalClassName[LocalVariableDescriptor]

'substringAfter' @ [80:29] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'method' @ [80:44] ==> value-parameter method: Method defined in kotlin.reflect.jvm.internal.KClassImpl.Data.calculateLocalClassName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [80:51] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'jClass' @ [82:13] ==> value-parameter jClass: Class<*> defined in kotlin.reflect.jvm.internal.KClassImpl.Data.calculateLocalClassName[ValueParameterDescriptorImpl]

'enclosingConstructor' @ [82:20] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.enclosingConstructor: (Constructor<*>..Constructor<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'let' @ [82:42] ==> @InlineOnly public inline fun <T, R> Constructor<*>.let(block: (Constructor<*>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constructor<*>
    <R> -> Nothing

'name' @ [83:24] ==> val name: (String..String?) defined in kotlin.reflect.jvm.internal.KClassImpl.Data.calculateLocalClassName[LocalVariableDescriptor]

'substringAfter' @ [83:29] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'constructor' @ [83:44] ==> value-parameter constructor: Constructor<*> defined in kotlin.reflect.jvm.internal.KClassImpl.Data.calculateLocalClassName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [83:56] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'name' @ [85:20] ==> val name: (String..String?) defined in kotlin.reflect.jvm.internal.KClassImpl.Data.calculateLocalClassName[LocalVariableDescriptor]

'substringAfter' @ [85:25] ==> public fun String.substringAfter(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [88:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'getValue' @ [89:55] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [89:73] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KFunction<T>>..List<KFunction<T>>?)): ReflectProperties.LazySoftVal<(List<KFunction<T>>..List<KFunction<T>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.reflect.KFunction<T>>..kotlin.collections.List<kotlin.reflect.KFunction<T>>?)

'constructorDescriptors' @ [90:13] ==> public open val constructorDescriptors: Collection<ConstructorDescriptor> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'map' @ [90:36] ==> public inline fun <T, R> Iterable<ConstructorDescriptor>.map(transform: (ConstructorDescriptor) -> KFunction<T>): List<KFunction<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor
    <R> -> KFunction<T>

'KFunctionImpl' @ [91:17] ==> public constructor KFunctionImpl(container: KDeclarationContainerImpl, descriptor: FunctionDescriptor) defined in kotlin.reflect.jvm.internal.KFunctionImpl[ClassConstructorDescriptorImpl]

'this@KClassImpl' @ [91:31] ==> <this> defined in kotlin.reflect.jvm.internal.KClassImpl[LazyClassReceiverParameterDescriptor]

'descriptor' @ [91:48] ==> value-parameter descriptor: ConstructorDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data.constructors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getValue' @ [95:53] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [95:71] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KClassImpl<out (Any..Any?)>>..List<KClassImpl<out (Any..Any?)>>?)): ReflectProperties.LazySoftVal<(List<KClassImpl<out (Any..Any?)>>..List<KClassImpl<out (Any..Any?)>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.reflect.jvm.internal.KClassImpl<out (kotlin.Any..kotlin.Any?)>>..kotlin.collections.List<kotlin.reflect.jvm.internal.KClassImpl<out (kotlin.Any..kotlin.Any?)>>?)

'descriptor' @ [96:13] ==> public final val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [96:24] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [96:55] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'filterNot' @ [96:83] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filterNot(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DescriptorUtils' @ [96:93] ==> private constructor DescriptorUtils() defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaClassConstructorDescriptor]

'isEnumEntry' @ [96:110] ==> public open fun isEnumEntry(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'mapNotNull' @ [96:123] ==> public inline fun <T, R : Any> Iterable<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> KClassImpl<out (Any..Any?)>?): List<KClassImpl<out (Any..Any?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> KClassImpl<out (kotlin.Any..kotlin.Any?)>

'nestedClass' @ [98:31] ==> value-parameter nestedClass: DeclarationDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data.nestedClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toJavaClass' @ [98:63] ==> internal fun ClassDescriptor.toJavaClass(): Class<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'jClass' @ [99:17] ==> val jClass: Class<*>? defined in kotlin.reflect.jvm.internal.KClassImpl.Data.nestedClasses.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [99:25] ==> @InlineOnly public inline fun <T, R> Class<*>.let(block: (Class<*>) -> KClassImpl<out (Any..Any?)>): KClassImpl<out (Any..Any?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>
    <R> -> KClassImpl<out (kotlin.Any..kotlin.Any?)>

'KClassImpl' @ [99:31] ==> public constructor KClassImpl<T : Any>(jClass: Class<out (Any..Any?)>) defined in kotlin.reflect.jvm.internal.KClassImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> Captured(*)

'it' @ [99:42] ==> value-parameter it: Class<*> defined in kotlin.reflect.jvm.internal.KClassImpl.Data.nestedClasses.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [103:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'getValue' @ [104:35] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'lazy' @ [104:53] ==> @NotNull public open fun <T : (Any..Any?)> lazy(@NotNull initializer: () -> T?): ReflectProperties.LazyVal<T?> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T?

'descriptor' @ [105:30] ==> public final val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'descriptor' @ [106:17] ==> val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance.<anonymous>[LocalVariableDescriptor]

'kind' @ [106:28] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [106:46] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'if (descriptor.isCompanionObject && !CompanionObjectMapping.isMappedIntrinsicCompanionObject(descriptor)) {
                jClass.enclosingClass.getDeclaredField(descriptor.name.asString())
            }
            else {
                jClass.getDeclaredField(JvmAbi.INSTANCE_FIELD)
            }' @ [108:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Field..Field?), elseBranch: (Field..Field?)): (Field..Field?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'descriptor' @ [108:29] ==> val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance.<anonymous>[LocalVariableDescriptor]

'isCompanionObject' @ [108:40] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'!' @ [108:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'CompanionObjectMapping' @ [108:62] ==> public object CompanionObjectMapping defined in org.jetbrains.kotlin.builtins in file CompanionObjectMapping.kt[FakeCallableDescriptorForObject]

'isMappedIntrinsicCompanionObject' @ [108:85] ==> public final fun isMappedIntrinsicCompanionObject(classDescriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.CompanionObjectMapping[SimpleFunctionDescriptorImpl]

'descriptor' @ [108:118] ==> val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance.<anonymous>[LocalVariableDescriptor]

'jClass' @ [109:17] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'enclosingClass' @ [109:24] ==> public final val <T : (Any..Any?)> Class<T>.enclosingClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'getDeclaredField' @ [109:39] ==> public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'descriptor' @ [109:56] ==> val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance.<anonymous>[LocalVariableDescriptor]

'name' @ [109:67] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [109:72] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'jClass' @ [112:17] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'getDeclaredField' @ [112:24] ==> public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'INSTANCE_FIELD' @ [112:48] ==> public const final val INSTANCE_FIELD: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'field' @ [114:13] ==> val field: (Field..Field?) defined in kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance.<anonymous>[LocalVariableDescriptor]

'get' @ [114:19] ==> public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'getValue' @ [117:53] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [117:71] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KTypeParameterImpl>..List<KTypeParameterImpl>?)): ReflectProperties.LazySoftVal<(List<KTypeParameterImpl>..List<KTypeParameterImpl>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.reflect.jvm.internal.KTypeParameterImpl>..kotlin.collections.List<kotlin.reflect.jvm.internal.KTypeParameterImpl>?)

'descriptor' @ [118:13] ==> public final val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'declaredTypeParameters' @ [118:24] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [118:47] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> KTypeParameterImpl): List<KTypeParameterImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> KTypeParameterImpl

'KTypeParameterImpl' @ [118:53] ==> public constructor KTypeParameterImpl(descriptor: TypeParameterDescriptor) defined in kotlin.reflect.jvm.internal.KTypeParameterImpl[ClassConstructorDescriptorImpl]

'getValue' @ [121:40] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [121:58] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KTypeImpl>..List<KTypeImpl>?)): ReflectProperties.LazySoftVal<(List<KTypeImpl>..List<KTypeImpl>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.reflect.jvm.internal.KTypeImpl>..kotlin.collections.List<kotlin.reflect.jvm.internal.KTypeImpl>?)

'descriptor' @ [122:31] ==> public final val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'typeConstructor' @ [122:42] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [122:58] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'ArrayList' @ [123:26] ==> public final fun <E> <init>(p0: Int): ArrayList<KTypeImpl> /* = ArrayList<KTypeImpl> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KTypeImpl

'kotlinTypes' @ [123:47] ==> val kotlinTypes: Collection<(KotlinType..KotlinType?)> defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>[LocalVariableDescriptor]

'size' @ [123:59] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'kotlinTypes' @ [124:13] ==> val kotlinTypes: Collection<(KotlinType..KotlinType?)> defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>[LocalVariableDescriptor]

'mapTo' @ [124:25] ==> public inline fun <T, R, C : MutableCollection<in KTypeImpl>> Iterable<(KotlinType..KotlinType?)>.mapTo(destination: ArrayList<KTypeImpl> /* = ArrayList<KTypeImpl> */, transform: ((KotlinType..KotlinType?)) -> KTypeImpl): ArrayList<KTypeImpl> /* = ArrayList<KTypeImpl> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> KTypeImpl
    <C : MutableCollection<in R>> -> ArrayList<KTypeImpl>

'result' @ [124:31] ==> val result: ArrayList<KTypeImpl> /* = ArrayList<KTypeImpl> */ defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>[LocalVariableDescriptor]

'KTypeImpl' @ [125:17] ==> public constructor KTypeImpl(type: KotlinType, computeJavaType: () -> Type) defined in kotlin.reflect.jvm.internal.KTypeImpl[ClassConstructorDescriptorImpl]

'kotlinType' @ [125:27] ==> value-parameter kotlinType: (KotlinType..KotlinType?) defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'kotlinType' @ [126:38] ==> value-parameter kotlinType: (KotlinType..KotlinType?) defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [126:49] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [126:61] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'superClass' @ [127:25] ==> val superClass: ClassifierDescriptor? defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'KotlinReflectionInternalError' @ [127:63] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'superClass' @ [127:118] ==> val superClass: ClassifierDescriptor? defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'superClass' @ [129:42] ==> val superClass: ClassifierDescriptor? defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toJavaClass' @ [129:53] ==> internal fun ClassDescriptor.toJavaClass(): Class<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'KotlinReflectionInternalError' @ [130:51] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'this' @ [130:109] ==> <this> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[LazyClassReceiverParameterDescriptor]

'superClass' @ [130:116] ==> val superClass: ClassifierDescriptor? defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (jClass.superclass == superJavaClass) {
                        jClass.genericSuperclass
                    }
                    else {
                        val index = jClass.interfaces.indexOf(superJavaClass)
                        if (index < 0) throw KotlinReflectionInternalError("No superclass of $this in Java reflection for $superClass")
                        jClass.genericInterfaces[index]
                    }' @ [132:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'jClass' @ [132:25] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'superclass' @ [132:32] ==> public final val <T : (Any..Any?)> Class<T>.superclass: (Class<in (T..T?)>..Class<in (T..T?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'superJavaClass' @ [132:46] ==> val superJavaClass: Class<*> defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'jClass' @ [133:25] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'genericSuperclass' @ [133:32] ==> public final val <T : (Any..Any?)> Class<T>.genericSuperclass: (Type..Type?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'jClass' @ [136:37] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'interfaces' @ [136:44] ==> public final val <T : (Any..Any?)> Class<T>.interfaces: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'indexOf' @ [136:55] ==> public fun <@OnlyInputTypes T> Array<out (Class<*>..Class<*>?)>.indexOf(element: (Class<*>..Class<*>?)): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.lang.Class<*>..java.lang.Class<*>?)

'superJavaClass' @ [136:63] ==> val superJavaClass: Class<*> defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'index' @ [137:29] ==> val index: Int defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'KotlinReflectionInternalError' @ [137:46] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'this' @ [137:95] ==> <this> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[LazyClassReceiverParameterDescriptor]

'superClass' @ [137:124] ==> val superClass: ClassifierDescriptor? defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'jClass' @ [138:25] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'genericInterfaces' @ [138:32] ==> public final val <T : (Any..Any?)> Class<T>.genericInterfaces: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'index' @ [138:50] ==> val index: Int defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'!' @ [142:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSpecialClassWithNoSupertypes' @ [142:33] ==> public open fun isSpecialClassWithNoSupertypes(@NotNull descriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'descriptor' @ [142:64] ==> public final val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'result' @ [142:79] ==> val result: ArrayList<KTypeImpl> /* = ArrayList<KTypeImpl> */ defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>[LocalVariableDescriptor]

'all' @ [142:86] ==> public inline fun <T> Iterable<KTypeImpl>.all(predicate: (KTypeImpl) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KTypeImpl

'getClassDescriptorForType' @ [143:49] ==> @NotNull public open fun getClassDescriptorForType(@NotNull type: KotlinType): ClassDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [143:75] ==> value-parameter it: KTypeImpl defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [143:78] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'kind' @ [143:84] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'classKind' @ [144:17] ==> val classKind: ClassKind defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>[LocalVariableDescriptor]

'INTERFACE' @ [144:40] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'classKind' @ [144:53] ==> val classKind: ClassKind defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ANNOTATION_CLASS' @ [144:76] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'result' @ [146:17] ==> val result: ArrayList<KTypeImpl> /* = ArrayList<KTypeImpl> */ defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>[LocalVariableDescriptor]

'KTypeImpl' @ [146:27] ==> public constructor KTypeImpl(type: KotlinType, computeJavaType: () -> Type) defined in kotlin.reflect.jvm.internal.KTypeImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [146:37] ==> public final val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'builtIns' @ [146:48] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'anyType' @ [146:57] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'Any' @ [146:68] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [146:79] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'result' @ [148:13] ==> val result: ArrayList<KTypeImpl> /* = ArrayList<KTypeImpl> */ defined in kotlin.reflect.jvm.internal.KClassImpl.Data.supertypes.<anonymous>[LocalVariableDescriptor]

'compact' @ [148:20] ==> public fun <T> ArrayList<KTypeImpl>.compact(): List<KTypeImpl> defined in org.jetbrains.kotlin.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KTypeImpl

'getValue' @ [152:20] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [152:38] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (Collection<KCallableImpl<*>>..Collection<KCallableImpl<*>>?)): ReflectProperties.LazySoftVal<(Collection<KCallableImpl<*>>..Collection<KCallableImpl<*>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.Collection<kotlin.reflect.jvm.internal.KCallableImpl<*>>..kotlin.collections.Collection<kotlin.reflect.jvm.internal.KCallableImpl<*>>?)

'getMembers' @ [152:49] ==> protected final fun getMembers(scope: MemberScope, belonginess: KDeclarationContainerImpl.MemberBelonginess): Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl[SimpleFunctionDescriptorImpl]

'memberScope' @ [152:60] ==> internal final val memberScope: MemberScope defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'DECLARED' @ [152:73] ==> enum entry DECLARED defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[FakeCallableDescriptorForObject]

'getValue' @ [154:20] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [154:38] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (Collection<KCallableImpl<*>>..Collection<KCallableImpl<*>>?)): ReflectProperties.LazySoftVal<(Collection<KCallableImpl<*>>..Collection<KCallableImpl<*>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.Collection<kotlin.reflect.jvm.internal.KCallableImpl<*>>..kotlin.collections.Collection<kotlin.reflect.jvm.internal.KCallableImpl<*>>?)

'getMembers' @ [154:49] ==> protected final fun getMembers(scope: MemberScope, belonginess: KDeclarationContainerImpl.MemberBelonginess): Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl[SimpleFunctionDescriptorImpl]

'staticScope' @ [154:60] ==> internal final val staticScope: MemberScope defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'DECLARED' @ [154:73] ==> enum entry DECLARED defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[FakeCallableDescriptorForObject]

'getValue' @ [156:20] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [156:38] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (Collection<KCallableImpl<*>>..Collection<KCallableImpl<*>>?)): ReflectProperties.LazySoftVal<(Collection<KCallableImpl<*>>..Collection<KCallableImpl<*>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.Collection<kotlin.reflect.jvm.internal.KCallableImpl<*>>..kotlin.collections.Collection<kotlin.reflect.jvm.internal.KCallableImpl<*>>?)

'getMembers' @ [156:49] ==> protected final fun getMembers(scope: MemberScope, belonginess: KDeclarationContainerImpl.MemberBelonginess): Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl[SimpleFunctionDescriptorImpl]

'memberScope' @ [156:60] ==> internal final val memberScope: MemberScope defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'INHERITED' @ [156:73] ==> enum entry INHERITED defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[FakeCallableDescriptorForObject]

'getValue' @ [158:20] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [158:38] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (Collection<KCallableImpl<*>>..Collection<KCallableImpl<*>>?)): ReflectProperties.LazySoftVal<(Collection<KCallableImpl<*>>..Collection<KCallableImpl<*>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.Collection<kotlin.reflect.jvm.internal.KCallableImpl<*>>..kotlin.collections.Collection<kotlin.reflect.jvm.internal.KCallableImpl<*>>?)

'getMembers' @ [158:49] ==> protected final fun getMembers(scope: MemberScope, belonginess: KDeclarationContainerImpl.MemberBelonginess): Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl[SimpleFunctionDescriptorImpl]

'staticScope' @ [158:60] ==> internal final val staticScope: MemberScope defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'INHERITED' @ [158:73] ==> enum entry INHERITED defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[FakeCallableDescriptorForObject]

'getValue' @ [161:20] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [161:38] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KCallableImpl<*>>..List<KCallableImpl<*>>?)): ReflectProperties.LazySoftVal<(List<KCallableImpl<*>>..List<KCallableImpl<*>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.reflect.jvm.internal.KCallableImpl<*>>..kotlin.collections.List<kotlin.reflect.jvm.internal.KCallableImpl<*>>?)

'declaredNonStaticMembers' @ [161:49] ==> public final val declaredNonStaticMembers: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'inheritedNonStaticMembers' @ [161:76] ==> public final val inheritedNonStaticMembers: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'getValue' @ [163:20] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [163:38] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KCallableImpl<*>>..List<KCallableImpl<*>>?)): ReflectProperties.LazySoftVal<(List<KCallableImpl<*>>..List<KCallableImpl<*>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.reflect.jvm.internal.KCallableImpl<*>>..kotlin.collections.List<kotlin.reflect.jvm.internal.KCallableImpl<*>>?)

'declaredStaticMembers' @ [163:49] ==> public final val declaredStaticMembers: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'inheritedStaticMembers' @ [163:73] ==> public final val inheritedStaticMembers: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'getValue' @ [165:20] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [165:38] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KCallableImpl<*>>..List<KCallableImpl<*>>?)): ReflectProperties.LazySoftVal<(List<KCallableImpl<*>>..List<KCallableImpl<*>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.reflect.jvm.internal.KCallableImpl<*>>..kotlin.collections.List<kotlin.reflect.jvm.internal.KCallableImpl<*>>?)

'declaredNonStaticMembers' @ [165:49] ==> public final val declaredNonStaticMembers: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'declaredStaticMembers' @ [165:76] ==> public final val declaredStaticMembers: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'getValue' @ [167:20] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (T..T?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [167:38] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<KCallableImpl<*>>..List<KCallableImpl<*>>?)): ReflectProperties.LazySoftVal<(List<KCallableImpl<*>>..List<KCallableImpl<*>>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.reflect.jvm.internal.KCallableImpl<*>>..kotlin.collections.List<kotlin.reflect.jvm.internal.KCallableImpl<*>>?)

'allNonStaticMembers' @ [167:49] ==> public final val allNonStaticMembers: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'allStaticMembers' @ [167:71] ==> public final val allStaticMembers: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'lazy' @ [170:34] ==> @NotNull public open fun <T : (Any..Any?)> lazy(@NotNull initializer: () -> (KClassImpl<T>.Data..KClassImpl<T>.Data?)): ReflectProperties.LazyVal<(KClassImpl<T>.Data..KClassImpl<T>.Data?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.reflect.jvm.internal.KClassImpl<T>.Data..kotlin.reflect.jvm.internal.KClassImpl<T>.Data?)

'Data' @ [170:41] ==> public constructor Data() defined in kotlin.reflect.jvm.internal.KClassImpl.Data[ClassConstructorDescriptorImpl]

'invoke' @ [172:54] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'descriptor' @ [172:61] ==> public final val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'invoke' @ [174:56] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'annotations' @ [174:63] ==> public final val annotations: List<Annotation> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'RuntimeTypeMapper' @ [176:42] ==> internal object RuntimeTypeMapper defined in kotlin.reflect.jvm.internal in file RuntimeTypeMapper.kt[FakeCallableDescriptorForObject]

'mapJvmClassToKotlinClassId' @ [176:60] ==> public final fun mapJvmClassToKotlinClassId(klass: Class<*>): ClassId defined in kotlin.reflect.jvm.internal.RuntimeTypeMapper[SimpleFunctionDescriptorImpl]

'jClass' @ [176:87] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'descriptor' @ [178:51] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'defaultType' @ [178:62] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [178:74] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'descriptor' @ [180:51] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'staticScope' @ [180:62] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'invoke' @ [182:60] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'allMembers' @ [182:67] ==> public final val allMembers: Collection<KCallableImpl<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'descriptor' @ [186:30] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'descriptor' @ [187:17] ==> val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.<get-constructorDescriptors>[LocalVariableDescriptor]

'kind' @ [187:28] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [187:46] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'descriptor' @ [187:59] ==> val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.<get-constructorDescriptors>[LocalVariableDescriptor]

'kind' @ [187:70] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [187:88] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'emptyList' @ [188:24] ==> public fun <T> emptyList(): List<ConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'descriptor' @ [190:20] ==> val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.<get-constructorDescriptors>[LocalVariableDescriptor]

'constructors' @ [190:31] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'memberScope' @ [194:14] ==> internal final val memberScope: MemberScope defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'getContributedVariables' @ [194:26] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [194:50] ==> value-parameter name: Name defined in kotlin.reflect.jvm.internal.KClassImpl.getProperties[ValueParameterDescriptorImpl]

'FROM_REFLECTION' @ [194:73] ==> enum entry FROM_REFLECTION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'staticScope' @ [195:14] ==> internal final val staticScope: MemberScope defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'getContributedVariables' @ [195:26] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [195:50] ==> value-parameter name: Name defined in kotlin.reflect.jvm.internal.KClassImpl.getProperties[ValueParameterDescriptorImpl]

'FROM_REFLECTION' @ [195:73] ==> enum entry FROM_REFLECTION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'memberScope' @ [198:13] ==> internal final val memberScope: MemberScope defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'getContributedFunctions' @ [198:25] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [198:49] ==> value-parameter name: Name defined in kotlin.reflect.jvm.internal.KClassImpl.getFunctions[ValueParameterDescriptorImpl]

'FROM_REFLECTION' @ [198:72] ==> enum entry FROM_REFLECTION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'staticScope' @ [199:13] ==> internal final val staticScope: MemberScope defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'getContributedFunctions' @ [199:25] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [199:49] ==> value-parameter name: Name defined in kotlin.reflect.jvm.internal.KClassImpl.getFunctions[ValueParameterDescriptorImpl]

'FROM_REFLECTION' @ [199:72] ==> enum entry FROM_REFLECTION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'jClass' @ [203:13] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'simpleName' @ [203:20] ==> public final val <T : (Any..Any?)> Class<T>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'DEFAULT_IMPLS_CLASS_NAME' @ [203:41] ==> public const final val DEFAULT_IMPLS_CLASS_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'jClass' @ [204:13] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'declaringClass' @ [204:20] ==> public final val <T : (Any..Any?)> Class<T>.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'let' @ [204:36] ==> @InlineOnly public inline fun <T, R> Class<*>.let(block: (Class<*>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>
    <R> -> Unit

'interfaceClass' @ [205:21] ==> value-parameter interfaceClass: Class<*> defined in kotlin.reflect.jvm.internal.KClassImpl.getLocalProperty.<anonymous>[ValueParameterDescriptorImpl]

'isInterface' @ [205:36] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isInterface: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'interfaceClass' @ [206:29] ==> value-parameter interfaceClass: Class<*> defined in kotlin.reflect.jvm.internal.KClassImpl.getLocalProperty.<anonymous>[ValueParameterDescriptorImpl]

'kotlin' @ [206:44] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(*)

'getLocalProperty' @ [206:69] ==> public open fun getLocalProperty(index: Int): PropertyDescriptor? defined in kotlin.reflect.jvm.internal.KClassImpl[SimpleFunctionDescriptorImpl]

'index' @ [206:86] ==> value-parameter index: Int defined in kotlin.reflect.jvm.internal.KClassImpl.getLocalProperty[ValueParameterDescriptorImpl]

'descriptor' @ [211:17] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'let' @ [211:62] ==> @InlineOnly public inline fun <T, R> DeserializedClassDescriptor.let(block: (DeserializedClassDescriptor) -> PropertyDescriptor?): PropertyDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeserializedClassDescriptor
    <R> -> PropertyDescriptor?

'descriptor' @ [212:25] ==> value-parameter descriptor: DeserializedClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.getLocalProperty.<anonymous>[ValueParameterDescriptorImpl]

'classProto' @ [212:36] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[PropertyDescriptorImpl]

'getExtension' @ [212:47] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)>?), p1: Int): (ProtoBuf.Property..ProtoBuf.Property?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Property..org.jetbrains.kotlin.serialization.ProtoBuf.Property?)

'classLocalVariable' @ [212:72] ==> public final val classLocalVariable: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'index' @ [212:92] ==> value-parameter index: Int defined in kotlin.reflect.jvm.internal.KClassImpl.getLocalProperty[ValueParameterDescriptorImpl]

'descriptor' @ [213:32] ==> value-parameter descriptor: DeserializedClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.getLocalProperty.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [213:43] ==> public final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[PropertyDescriptorImpl]

'nameResolver' @ [213:45] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'deserializeToDescriptor' @ [214:13] ==> internal fun <M : MessageLite, D : CallableDescriptor> deserializeToDescriptor(moduleAnchor: Class<*>, proto: (ProtoBuf.Property..ProtoBuf.Property?), nameResolver: NameResolver, typeTable: TypeTable, createDescriptor: MemberDeserializer.((ProtoBuf.Property..ProtoBuf.Property?)) -> PropertyDescriptor): PropertyDescriptor? defined in kotlin.reflect.jvm.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : MessageLite> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Property..org.jetbrains.kotlin.serialization.ProtoBuf.Property?)
    <D : CallableDescriptor> -> PropertyDescriptor

'jClass' @ [214:37] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'proto' @ [214:45] ==> val proto: (ProtoBuf.Property..ProtoBuf.Property?) defined in kotlin.reflect.jvm.internal.KClassImpl.getLocalProperty.<anonymous>[LocalVariableDescriptor]

'nameResolver' @ [214:52] ==> val nameResolver: NameResolver defined in kotlin.reflect.jvm.internal.KClassImpl.getLocalProperty.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [214:66] ==> value-parameter descriptor: DeserializedClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl.getLocalProperty.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [214:77] ==> public final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[PropertyDescriptorImpl]

'typeTable' @ [214:79] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'MemberDeserializer' @ [214:90] ==> public constructor MemberDeserializer(c: DeserializationContext) defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[ClassConstructorDescriptorImpl]

'loadProperty' @ [214:110] ==> public final fun loadProperty(proto: ProtoBuf.Property): PropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'invoke' @ [218:46] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'simpleName' @ [218:53] ==> public final val simpleName: String? defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'invoke' @ [220:49] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'qualifiedName' @ [220:56] ==> public final val qualifiedName: String? defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'invoke' @ [222:65] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'constructors' @ [222:72] ==> @Suppress public final val constructors: Collection<KFunction<T>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'invoke' @ [224:63] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'nestedClasses' @ [224:70] ==> public final val nestedClasses: Collection<KClass<*>> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'invoke' @ [226:45] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'objectInstance' @ [226:52] ==> @Suppress public final val objectInstance: T? defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'jClass' @ [230:9] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'functionClassArity' @ [230:16] ==> public val Class<*>.functionClassArity: Int? defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'let' @ [230:36] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Nothing

'isFunctionOfArity' @ [231:35] ==> public open fun isFunctionOfArity(p0: (Any..Any?), p1: Int): Boolean defined in kotlin.jvm.internal.TypeIntrinsics[JavaMethodDescriptor]

'value' @ [231:53] ==> value-parameter value: Any? defined in kotlin.reflect.jvm.internal.KClassImpl.isInstance[ValueParameterDescriptorImpl]

'arity' @ [231:60] ==> value-parameter arity: Int defined in kotlin.reflect.jvm.internal.KClassImpl.isInstance.<anonymous>[ValueParameterDescriptorImpl]

'jClass' @ [233:17] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'wrapperByPrimitive' @ [233:24] ==> public val Class<*>.wrapperByPrimitive: Class<*>? defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'jClass' @ [233:46] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'isInstance' @ [233:54] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'value' @ [233:65] ==> value-parameter value: Any? defined in kotlin.reflect.jvm.internal.KClassImpl.isInstance[ValueParameterDescriptorImpl]

'invoke' @ [236:63] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'typeParameters' @ [236:70] ==> public final val typeParameters: List<KTypeParameter> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'invoke' @ [238:50] ==> @Override public open fun invoke(): (KClassImpl<T>.Data..KClassImpl<T>.Data?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'supertypes' @ [238:57] ==> public final val supertypes: List<KType> defined in kotlin.reflect.jvm.internal.KClassImpl.Data[PropertyDescriptorImpl]

'descriptor' @ [241:17] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'visibility' @ [241:28] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'toKVisibility' @ [241:39] ==> internal fun Visibility.toKVisibility(): KVisibility? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [244:17] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'modality' @ [244:28] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'FINAL' @ [244:49] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'descriptor' @ [247:17] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'modality' @ [247:28] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'OPEN' @ [247:49] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'descriptor' @ [250:17] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'modality' @ [250:28] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [250:49] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'descriptor' @ [253:17] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'modality' @ [253:28] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'SEALED' @ [253:49] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'descriptor' @ [256:17] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'isData' @ [256:28] ==> public final val ClassDescriptor.isData: Boolean[MyPropertyDescriptor]

'descriptor' @ [259:17] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'isInner' @ [259:28] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'descriptor' @ [262:17] ==> public open val descriptor: ClassDescriptor defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'isCompanionObject' @ [262:28] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'other' @ [265:13] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KClassImpl.equals[ValueParameterDescriptorImpl]

'javaObjectType' @ [265:39] ==> public val <T : Any> KClass<T>.javaObjectType: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'other' @ [265:57] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KClassImpl.equals[ValueParameterDescriptorImpl]

'javaObjectType' @ [265:63] ==> public val <T : Any> KClass<out Any>.javaObjectType: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(out Any)

'javaObjectType' @ [268:13] ==> public val <T : Any> KClass<T>.javaObjectType: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'hashCode' @ [268:28] ==> public open fun hashCode(): Int defined in java.lang.Class[DeserializedSimpleFunctionDescriptor]

'+' @ [271:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'classId' @ [271:27] ==> private final val classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'let' @ [271:35] ==> @InlineOnly public inline fun <T, R> ClassId.let(block: (ClassId) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId
    <R> -> String

'classId' @ [272:33] ==> value-parameter classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl.toString.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [272:41] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'if (packageFqName.isRoot) "" else packageFqName.asString() + "."' @ [273:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'packageFqName' @ [273:37] ==> val packageFqName: FqName defined in kotlin.reflect.jvm.internal.KClassImpl.toString.<anonymous>[LocalVariableDescriptor]

'isRoot' @ [273:51] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'packageFqName' @ [273:67] ==> val packageFqName: FqName defined in kotlin.reflect.jvm.internal.KClassImpl.toString.<anonymous>[LocalVariableDescriptor]

'asString' @ [273:81] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'classId' @ [274:31] ==> value-parameter classId: ClassId defined in kotlin.reflect.jvm.internal.KClassImpl.toString.<anonymous>[ValueParameterDescriptorImpl]

'relativeClassName' @ [274:39] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [274:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'replace' @ [274:68] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'packagePrefix' @ [275:13] ==> val packagePrefix: String defined in kotlin.reflect.jvm.internal.KClassImpl.toString.<anonymous>[LocalVariableDescriptor]

'classSuffix' @ [275:29] ==> val classSuffix: String defined in kotlin.reflect.jvm.internal.KClassImpl.toString.<anonymous>[LocalVariableDescriptor]

'ReflectKotlinClass' @ [280:20] ==> public companion object Factory defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[FakeCallableDescriptorForObject]

'create' @ [280:39] ==> public final fun create(klass: Class<*>): ReflectKotlinClass? defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass.Factory[SimpleFunctionDescriptorImpl]

'jClass' @ [280:46] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'classHeader' @ [280:55] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[PropertyDescriptorImpl]

'kind' @ [280:68] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'when (kind) {
            KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART -> {
                throw UnsupportedOperationException(
                        "Packages and file facades are not yet supported in Kotlin reflection. " +
                        "Meanwhile please use Java reflection to inspect this class: $jClass"
                )
            }
            KotlinClassHeader.Kind.SYNTHETIC_CLASS -> {
                throw UnsupportedOperationException(
                        "This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class " +
                        "for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection " +
                        "library has no idea what declarations does it have. Please use Java reflection to inspect this class: $jClass"
                )
            }
            KotlinClassHeader.Kind.UNKNOWN -> {
                // Should not happen since ABI-related exception must have happened earlier
                throw KotlinReflectionInternalError("Unknown class: $jClass (kind = $kind)")
            }
            KotlinClassHeader.Kind.CLASS, null -> {
                // Should not happen since a proper Kotlin- or Java-class must have been resolved
                throw KotlinReflectionInternalError("Unresolved class: $jClass")
            }
        }' @ [281:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'kind' @ [281:15] ==> val kind: KotlinClassHeader.Kind? defined in kotlin.reflect.jvm.internal.KClassImpl.reportUnresolvedClass[LocalVariableDescriptor]

'FILE_FACADE' @ [282:36] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'MULTIFILE_CLASS' @ [282:72] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'MULTIFILE_CLASS_PART' @ [282:112] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [283:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [284:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'jClass' @ [285:87] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'SYNTHETIC_CLASS' @ [288:36] ==> enum entry SYNTHETIC_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [289:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [290:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'jClass' @ [292:129] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'UNKNOWN' @ [295:36] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'KotlinReflectionInternalError' @ [297:23] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'jClass' @ [297:70] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'kind' @ [297:86] ==> val kind: KotlinClassHeader.Kind? defined in kotlin.reflect.jvm.internal.KClassImpl.reportUnresolvedClass[LocalVariableDescriptor]

'CLASS' @ [299:36] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'KotlinReflectionInternalError' @ [301:23] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'jClass' @ [301:73] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

