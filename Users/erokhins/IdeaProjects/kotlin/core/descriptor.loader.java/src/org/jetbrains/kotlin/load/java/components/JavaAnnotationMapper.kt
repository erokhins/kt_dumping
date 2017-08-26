'FqName' @ [44:39] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'Target' @ [44:46] ==> public constructor Target(vararg value: ElementType) defined in java.lang.annotation.Target[JavaClassConstructorDescriptor]

'java' @ [44:60] ==> public val <T> KClass<Target>.java: Class<Target> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Target

'canonicalName' @ [44:65] ==> public final val <T : (Any..Any?)> Class<Target>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Target

'FqName' @ [45:42] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'Retention' @ [45:49] ==> public constructor Retention(value: AnnotationRetention = ...) defined in kotlin.annotation.Retention[DeserializedClassConstructorDescriptor]

'java' @ [45:66] ==> public val <T> KClass<Retention>.java: Class<Retention> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Retention

'canonicalName' @ [45:71] ==> public final val <T : (Any..Any?)> Class<Retention>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Retention

'FqName' @ [46:43] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'Deprecated' @ [46:60] ==> public constructor Deprecated() defined in java.lang.Deprecated[JavaClassConstructorDescriptor]

'java' @ [46:78] ==> public val <T> KClass<Deprecated>.java: Class<Deprecated> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Deprecated

'canonicalName' @ [46:83] ==> public final val <T : (Any..Any?)> Class<Deprecated>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Deprecated

'FqName' @ [47:43] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'Documented' @ [47:50] ==> public constructor Documented() defined in java.lang.annotation.Documented[JavaClassConstructorDescriptor]

'java' @ [47:68] ==> public val <T> KClass<Documented>.java: Class<Documented> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Documented

'canonicalName' @ [47:73] ==> public final val <T : (Any..Any?)> Class<Documented>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Documented

'FqName' @ [49:43] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'identifier' @ [51:55] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'identifier' @ [52:59] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'identifier' @ [53:52] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'when (annotation.classId) {
                ClassId.topLevel(JAVA_TARGET_FQ_NAME) -> JavaTargetAnnotationDescriptor(annotation, c)
                ClassId.topLevel(JAVA_RETENTION_FQ_NAME) -> JavaRetentionAnnotationDescriptor(annotation, c)
                ClassId.topLevel(JAVA_REPEATABLE_FQ_NAME) -> JavaAnnotationDescriptor(c, annotation, KotlinBuiltIns.FQ_NAMES.repeatable)
                ClassId.topLevel(JAVA_DOCUMENTED_FQ_NAME) -> JavaAnnotationDescriptor(c, annotation, KotlinBuiltIns.FQ_NAMES.mustBeDocumented)
                ClassId.topLevel(JAVA_DEPRECATED_FQ_NAME) -> null
                else -> LazyJavaAnnotationDescriptor(c, annotation)
            }' @ [56:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AnnotationDescriptor?, entry1: AnnotationDescriptor?, entry2: AnnotationDescriptor?, entry3: AnnotationDescriptor?, entry4: AnnotationDescriptor?, entry5: AnnotationDescriptor?): AnnotationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AnnotationDescriptor?

'annotation' @ [56:19] ==> value-parameter annotation: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'classId' @ [56:30] ==> public abstract val classId: ClassId? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotation[PropertyDescriptorImpl]

'topLevel' @ [57:25] ==> @NotNull public open fun topLevel(@NotNull topLevelFqName: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'JAVA_TARGET_FQ_NAME' @ [57:34] ==> private final val JAVA_TARGET_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'JavaTargetAnnotationDescriptor' @ [57:58] ==> public constructor JavaTargetAnnotationDescriptor(annotation: JavaAnnotation, c: LazyJavaResolverContext) defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor[ClassConstructorDescriptorImpl]

'annotation' @ [57:89] ==> value-parameter annotation: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'c' @ [57:101] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'topLevel' @ [58:25] ==> @NotNull public open fun topLevel(@NotNull topLevelFqName: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'JAVA_RETENTION_FQ_NAME' @ [58:34] ==> private final val JAVA_RETENTION_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'JavaRetentionAnnotationDescriptor' @ [58:61] ==> public constructor JavaRetentionAnnotationDescriptor(annotation: JavaAnnotation, c: LazyJavaResolverContext) defined in org.jetbrains.kotlin.load.java.components.JavaRetentionAnnotationDescriptor[ClassConstructorDescriptorImpl]

'annotation' @ [58:95] ==> value-parameter annotation: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'c' @ [58:107] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'topLevel' @ [59:25] ==> @NotNull public open fun topLevel(@NotNull topLevelFqName: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'JAVA_REPEATABLE_FQ_NAME' @ [59:34] ==> private final val JAVA_REPEATABLE_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'JavaAnnotationDescriptor' @ [59:62] ==> public constructor JavaAnnotationDescriptor(c: LazyJavaResolverContext, annotation: JavaAnnotation?, fqName: FqName) defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor[ClassConstructorDescriptorImpl]

'c' @ [59:87] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'annotation' @ [59:90] ==> value-parameter annotation: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'FQ_NAMES' @ [59:117] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'repeatable' @ [59:126] ==> public final val repeatable: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'topLevel' @ [60:25] ==> @NotNull public open fun topLevel(@NotNull topLevelFqName: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'JAVA_DOCUMENTED_FQ_NAME' @ [60:34] ==> private final val JAVA_DOCUMENTED_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'JavaAnnotationDescriptor' @ [60:62] ==> public constructor JavaAnnotationDescriptor(c: LazyJavaResolverContext, annotation: JavaAnnotation?, fqName: FqName) defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor[ClassConstructorDescriptorImpl]

'c' @ [60:87] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'annotation' @ [60:90] ==> value-parameter annotation: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'FQ_NAMES' @ [60:117] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mustBeDocumented' @ [60:126] ==> public final val mustBeDocumented: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'topLevel' @ [61:25] ==> @NotNull public open fun topLevel(@NotNull topLevelFqName: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'JAVA_DEPRECATED_FQ_NAME' @ [61:34] ==> private final val JAVA_DEPRECATED_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'LazyJavaAnnotationDescriptor' @ [62:25] ==> public constructor LazyJavaAnnotationDescriptor(c: LazyJavaResolverContext, javaAnnotation: JavaAnnotation) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor[ClassConstructorDescriptorImpl]

'c' @ [62:54] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'annotation' @ [62:57] ==> value-parameter annotation: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.mapOrResolveJavaAnnotation[ValueParameterDescriptorImpl]

'kotlinName' @ [70:13] ==> value-parameter kotlinName: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation[ValueParameterDescriptorImpl]

'FQ_NAMES' @ [70:42] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'deprecated' @ [70:51] ==> public final val deprecated: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'annotationOwner' @ [71:34] ==> value-parameter annotationOwner: JavaAnnotationOwner defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation[ValueParameterDescriptorImpl]

'findAnnotation' @ [71:50] ==> public abstract fun findAnnotation(fqName: FqName): JavaAnnotation? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotationOwner[SimpleFunctionDescriptorImpl]

'JAVA_DEPRECATED_FQ_NAME' @ [71:65] ==> private final val JAVA_DEPRECATED_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'javaAnnotation' @ [72:17] ==> val javaAnnotation: JavaAnnotation? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation[LocalVariableDescriptor]

'annotationOwner' @ [72:43] ==> value-parameter annotationOwner: JavaAnnotationOwner defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation[ValueParameterDescriptorImpl]

'isDeprecatedInJavaDoc' @ [72:59] ==> public abstract val isDeprecatedInJavaDoc: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotationOwner[PropertyDescriptorImpl]

'JavaDeprecatedAnnotationDescriptor' @ [73:24] ==> public constructor JavaDeprecatedAnnotationDescriptor(annotation: JavaAnnotation?, c: LazyJavaResolverContext) defined in org.jetbrains.kotlin.load.java.components.JavaDeprecatedAnnotationDescriptor[ClassConstructorDescriptorImpl]

'javaAnnotation' @ [73:59] ==> val javaAnnotation: JavaAnnotation? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation[LocalVariableDescriptor]

'c' @ [73:75] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation[ValueParameterDescriptorImpl]

'kotlinToJavaNameMap' @ [76:16] ==> private final val kotlinToJavaNameMap: Map<FqName, FqName> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'kotlinName' @ [76:36] ==> value-parameter kotlinName: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation[ValueParameterDescriptorImpl]

'let' @ [76:49] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> AnnotationDescriptor?): AnnotationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> AnnotationDescriptor?

'annotationOwner' @ [77:13] ==> value-parameter annotationOwner: JavaAnnotationOwner defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation[ValueParameterDescriptorImpl]

'findAnnotation' @ [77:29] ==> public abstract fun findAnnotation(fqName: FqName): JavaAnnotation? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotationOwner[SimpleFunctionDescriptorImpl]

'it' @ [77:44] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [77:49] ==> @InlineOnly public inline fun <T, R> JavaAnnotation.let(block: (JavaAnnotation) -> AnnotationDescriptor?): AnnotationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation
    <R> -> AnnotationDescriptor?

'mapOrResolveJavaAnnotation' @ [78:17] ==> public final fun mapOrResolveJavaAnnotation(annotation: JavaAnnotation, c: LazyJavaResolverContext): AnnotationDescriptor? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[SimpleFunctionDescriptorImpl]

'it' @ [78:44] ==> value-parameter it: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [78:48] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper.findMappedJavaAnnotation[ValueParameterDescriptorImpl]

'mapOf' @ [85:13] ==> public fun <K, V> mapOf(vararg pairs: Pair<FqName, FqName>): Map<FqName, FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> FqName

'to' @ [85:19] ==> public infix fun <A, B> (FqName..FqName?).to(that: FqName): Pair<(FqName..FqName?), FqName> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <B> -> FqName

'FQ_NAMES' @ [85:34] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'target' @ [85:43] ==> public final val target: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'JAVA_TARGET_FQ_NAME' @ [85:53] ==> private final val JAVA_TARGET_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'to' @ [86:19] ==> public infix fun <A, B> (FqName..FqName?).to(that: FqName): Pair<(FqName..FqName?), FqName> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <B> -> FqName

'FQ_NAMES' @ [86:34] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'retention' @ [86:43] ==> public final val retention: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'JAVA_RETENTION_FQ_NAME' @ [86:56] ==> private final val JAVA_RETENTION_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'to' @ [87:19] ==> public infix fun <A, B> (FqName..FqName?).to(that: FqName): Pair<(FqName..FqName?), FqName> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <B> -> FqName

'FQ_NAMES' @ [87:34] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'repeatable' @ [87:43] ==> public final val repeatable: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'JAVA_REPEATABLE_FQ_NAME' @ [87:57] ==> private final val JAVA_REPEATABLE_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'to' @ [88:19] ==> public infix fun <A, B> (FqName..FqName?).to(that: FqName): Pair<(FqName..FqName?), FqName> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <B> -> FqName

'FQ_NAMES' @ [88:34] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mustBeDocumented' @ [88:43] ==> public final val mustBeDocumented: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'JAVA_DOCUMENTED_FQ_NAME' @ [88:63] ==> private final val JAVA_DOCUMENTED_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'mapOf' @ [91:13] ==> public fun <K, V> mapOf(vararg pairs: Pair<FqName, (FqName..FqName?)>): Map<FqName, (FqName..FqName?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'JAVA_TARGET_FQ_NAME' @ [91:19] ==> private final val JAVA_TARGET_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'FQ_NAMES' @ [91:61] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'target' @ [91:70] ==> public final val target: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'JAVA_RETENTION_FQ_NAME' @ [92:19] ==> private final val JAVA_RETENTION_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'FQ_NAMES' @ [92:61] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'retention' @ [92:70] ==> public final val retention: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'JAVA_DEPRECATED_FQ_NAME' @ [93:19] ==> private final val JAVA_DEPRECATED_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'FQ_NAMES' @ [93:61] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'deprecated' @ [93:70] ==> public final val deprecated: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'JAVA_REPEATABLE_FQ_NAME' @ [94:19] ==> private final val JAVA_REPEATABLE_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'FQ_NAMES' @ [94:61] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'repeatable' @ [94:70] ==> public final val repeatable: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'JAVA_DOCUMENTED_FQ_NAME' @ [95:19] ==> private final val JAVA_DOCUMENTED_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'FQ_NAMES' @ [95:61] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mustBeDocumented' @ [95:70] ==> public final val mustBeDocumented: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'annotation' @ [103:42] ==> value-parameter annotation: JavaAnnotation? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'let' @ [103:54] ==> @InlineOnly public inline fun <T, R> JavaAnnotation.let(block: (JavaAnnotation) -> JavaSourceElement): JavaSourceElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation
    <R> -> JavaSourceElement

'c' @ [103:60] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'components' @ [103:62] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [103:73] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [103:94] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'it' @ [103:101] ==> value-parameter it: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor.source.<anonymous>[ValueParameterDescriptorImpl]

'NO_SOURCE' @ [103:124] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'c' @ [105:38] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [105:40] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [105:55] ==> public abstract fun <T : Any> createLazyValue(computable: () -> SimpleType): NotNullLazyValue<SimpleType> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> SimpleType

'c' @ [105:73] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'module' @ [105:75] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [105:82] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'getBuiltInClassByFqName' @ [105:91] ==> @NotNull public open fun getBuiltInClassByFqName(@NotNull fqName: FqName): ClassDescriptor defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'fqName' @ [105:115] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor[PropertyDescriptorImpl]

'defaultType' @ [105:123] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'annotation' @ [107:60] ==> value-parameter annotation: JavaAnnotation? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'arguments' @ [107:72] ==> public abstract val arguments: Collection<JavaAnnotationArgument> defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotation[PropertyDescriptorImpl]

'firstOrNull' @ [107:83] ==> public fun <T> Iterable<JavaAnnotationArgument>.firstOrNull(): JavaAnnotationArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotationArgument

'emptyMap' @ [109:73] ==> public fun <K, V> emptyMap(): Map<Name, ConstantValue<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'JavaAnnotationDescriptor' @ [115:4] ==> public constructor JavaAnnotationDescriptor(c: LazyJavaResolverContext, annotation: JavaAnnotation?, fqName: FqName) defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor[ClassConstructorDescriptorImpl]

'c' @ [115:29] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaDeprecatedAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'annotation' @ [115:32] ==> value-parameter annotation: JavaAnnotation? defined in org.jetbrains.kotlin.load.java.components.JavaDeprecatedAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'FQ_NAMES' @ [115:59] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'deprecated' @ [115:68] ==> public final val deprecated: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'c' @ [116:68] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaDeprecatedAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [116:70] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [116:85] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<Name, StringValue>): NotNullLazyValue<Map<Name, StringValue>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Map<Name, StringValue>

'mapOf' @ [117:9] ==> public fun <K, V> mapOf(pair: Pair<Name, StringValue>): Map<Name, StringValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> StringValue

'JavaAnnotationMapper' @ [117:15] ==> public object JavaAnnotationMapper defined in org.jetbrains.kotlin.load.java.components in file JavaAnnotationMapper.kt[FakeCallableDescriptorForObject]

'DEPRECATED_ANNOTATION_MESSAGE' @ [117:36] ==> internal final val DEPRECATED_ANNOTATION_MESSAGE: Name defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'ConstantValueFactory' @ [118:23] ==> public constructor ConstantValueFactory(builtins: KotlinBuiltIns) defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[ClassConstructorDescriptorImpl]

'c' @ [118:44] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaDeprecatedAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'module' @ [118:46] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [118:53] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'createStringValue' @ [118:63] ==> public final fun createStringValue(value: String): StringValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[SimpleFunctionDescriptorImpl]

'JavaAnnotationDescriptor' @ [125:4] ==> public constructor JavaAnnotationDescriptor(c: LazyJavaResolverContext, annotation: JavaAnnotation?, fqName: FqName) defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor[ClassConstructorDescriptorImpl]

'c' @ [125:29] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'annotation' @ [125:32] ==> value-parameter annotation: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'FQ_NAMES' @ [125:59] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'target' @ [125:68] ==> public final val target: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'c' @ [126:39] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [126:41] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [126:56] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<Name, ConstantValue<*>>): NotNullLazyValue<Map<Name, ConstantValue<*>>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Map<Name, ConstantValue<*>>

'when (firstArgument) {
            is JavaArrayAnnotationArgument -> JavaAnnotationTargetMapper.mapJavaTargetArguments(firstArgument.getElements(), c.module.builtIns)
            is JavaEnumValueAnnotationArgument -> JavaAnnotationTargetMapper.mapJavaTargetArguments(listOf(firstArgument), c.module.builtIns)
            else -> null
        }' @ [127:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ConstantValue<*>?, entry1: ConstantValue<*>?, entry2: ConstantValue<*>?): ConstantValue<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ConstantValue<*>?

'firstArgument' @ [127:36] ==> protected final val firstArgument: JavaAnnotationArgument? defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor[PropertyDescriptorImpl]

'mapJavaTargetArguments' @ [128:74] ==> internal final fun mapJavaTargetArguments(arguments: List<JavaAnnotationArgument>, builtIns: KotlinBuiltIns): ConstantValue<*> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper[SimpleFunctionDescriptorImpl]

'firstArgument' @ [128:97] ==> protected final val firstArgument: JavaAnnotationArgument? defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor[PropertyDescriptorImpl]

'getElements' @ [128:111] ==> public abstract fun getElements(): List<JavaAnnotationArgument> defined in org.jetbrains.kotlin.load.java.structure.JavaArrayAnnotationArgument[SimpleFunctionDescriptorImpl]

'c' @ [128:126] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'module' @ [128:128] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [128:135] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'mapJavaTargetArguments' @ [129:78] ==> internal final fun mapJavaTargetArguments(arguments: List<JavaAnnotationArgument>, builtIns: KotlinBuiltIns): ConstantValue<*> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper[SimpleFunctionDescriptorImpl]

'listOf' @ [129:101] ==> public fun <T> listOf(element: JavaEnumValueAnnotationArgument): List<JavaEnumValueAnnotationArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaEnumValueAnnotationArgument

'firstArgument' @ [129:108] ==> protected final val firstArgument: JavaAnnotationArgument? defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor[PropertyDescriptorImpl]

'c' @ [129:124] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'module' @ [129:126] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [129:133] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'targetArgument' @ [132:9] ==> val targetArgument: ConstantValue<*>? defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor.allValueArguments.<anonymous>[LocalVariableDescriptor]

'let' @ [132:25] ==> @InlineOnly public inline fun <T, R> ConstantValue<*>.let(block: (ConstantValue<*>) -> Map<Name, ConstantValue<*>>): Map<Name, ConstantValue<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<*>
    <R> -> Map<Name, ConstantValue<*>>

'mapOf' @ [132:31] ==> public fun <K, V> mapOf(pair: Pair<Name, ConstantValue<*>>): Map<Name, ConstantValue<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'JavaAnnotationMapper' @ [132:37] ==> public object JavaAnnotationMapper defined in org.jetbrains.kotlin.load.java.components in file JavaAnnotationMapper.kt[FakeCallableDescriptorForObject]

'TARGET_ANNOTATION_ALLOWED_TARGETS' @ [132:58] ==> internal final val TARGET_ANNOTATION_ALLOWED_TARGETS: Name defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'it' @ [132:95] ==> value-parameter it: ConstantValue<*> defined in org.jetbrains.kotlin.load.java.components.JavaTargetAnnotationDescriptor.allValueArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'orEmpty' @ [132:101] ==> @InlineOnly public inline fun <K, V> Map<Name, ConstantValue<*>>?.orEmpty(): Map<Name, ConstantValue<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'JavaAnnotationDescriptor' @ [139:4] ==> public constructor JavaAnnotationDescriptor(c: LazyJavaResolverContext, annotation: JavaAnnotation?, fqName: FqName) defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationDescriptor[ClassConstructorDescriptorImpl]

'c' @ [139:29] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaRetentionAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'annotation' @ [139:32] ==> value-parameter annotation: JavaAnnotation defined in org.jetbrains.kotlin.load.java.components.JavaRetentionAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'FQ_NAMES' @ [139:59] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'retention' @ [139:68] ==> public final val retention: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'c' @ [140:39] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaRetentionAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [140:41] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [140:56] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<Name, ConstantValue<*>>): NotNullLazyValue<Map<Name, ConstantValue<*>>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Map<Name, ConstantValue<*>>

'JavaAnnotationTargetMapper' @ [141:33] ==> public object JavaAnnotationTargetMapper defined in org.jetbrains.kotlin.load.java.components in file JavaAnnotationMapper.kt[FakeCallableDescriptorForObject]

'mapJavaRetentionArgument' @ [141:60] ==> internal final fun mapJavaRetentionArgument(element: JavaAnnotationArgument?, builtIns: KotlinBuiltIns): ConstantValue<*>? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper[SimpleFunctionDescriptorImpl]

'firstArgument' @ [141:85] ==> protected final val firstArgument: JavaAnnotationArgument? defined in org.jetbrains.kotlin.load.java.components.JavaRetentionAnnotationDescriptor[PropertyDescriptorImpl]

'c' @ [141:100] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.components.JavaRetentionAnnotationDescriptor.<init>[ValueParameterDescriptorImpl]

'module' @ [141:102] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [141:109] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'retentionArgument' @ [142:9] ==> val retentionArgument: ConstantValue<*>? defined in org.jetbrains.kotlin.load.java.components.JavaRetentionAnnotationDescriptor.allValueArguments.<anonymous>[LocalVariableDescriptor]

'let' @ [142:28] ==> @InlineOnly public inline fun <T, R> ConstantValue<*>.let(block: (ConstantValue<*>) -> Map<Name, ConstantValue<*>>): Map<Name, ConstantValue<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<*>
    <R> -> Map<Name, ConstantValue<*>>

'mapOf' @ [142:34] ==> public fun <K, V> mapOf(pair: Pair<Name, ConstantValue<*>>): Map<Name, ConstantValue<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'JavaAnnotationMapper' @ [142:40] ==> public object JavaAnnotationMapper defined in org.jetbrains.kotlin.load.java.components in file JavaAnnotationMapper.kt[FakeCallableDescriptorForObject]

'RETENTION_ANNOTATION_VALUE' @ [142:61] ==> internal final val RETENTION_ANNOTATION_VALUE: Name defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'it' @ [142:91] ==> value-parameter it: ConstantValue<*> defined in org.jetbrains.kotlin.load.java.components.JavaRetentionAnnotationDescriptor.allValueArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'orEmpty' @ [142:97] ==> @InlineOnly public inline fun <K, V> Map<Name, ConstantValue<*>>?.orEmpty(): Map<Name, ConstantValue<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'mapOf' @ [147:35] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)>): Map<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'to' @ [147:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'noneOf' @ [147:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> noneOf(p0: (Class<(KotlinTarget..KotlinTarget?)>..Class<(KotlinTarget..KotlinTarget?)>?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'KotlinTarget' @ [147:77] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'java' @ [147:97] ==> public val <T> KClass<KotlinTarget>.java: Class<KotlinTarget> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinTarget

'to' @ [148:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'of' @ [148:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> of(p0: (KotlinTarget..KotlinTarget?), p1: (KotlinTarget..KotlinTarget?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'CLASS' @ [148:86] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'FILE' @ [148:106] ==> enum entry FILE defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'to' @ [149:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'of' @ [149:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> of(p0: (KotlinTarget..KotlinTarget?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'ANNOTATION_CLASS' @ [149:86] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'to' @ [150:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'of' @ [150:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> of(p0: (KotlinTarget..KotlinTarget?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'TYPE_PARAMETER' @ [150:86] ==> enum entry TYPE_PARAMETER defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'to' @ [151:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'of' @ [151:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> of(p0: (KotlinTarget..KotlinTarget?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'FIELD' @ [151:86] ==> enum entry FIELD defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'to' @ [152:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'of' @ [152:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> of(p0: (KotlinTarget..KotlinTarget?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'LOCAL_VARIABLE' @ [152:86] ==> enum entry LOCAL_VARIABLE defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'to' @ [153:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'of' @ [153:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> of(p0: (KotlinTarget..KotlinTarget?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'VALUE_PARAMETER' @ [153:86] ==> enum entry VALUE_PARAMETER defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'to' @ [154:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'of' @ [154:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> of(p0: (KotlinTarget..KotlinTarget?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'CONSTRUCTOR' @ [154:86] ==> enum entry CONSTRUCTOR defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'to' @ [155:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'of' @ [155:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> of(p0: (KotlinTarget..KotlinTarget?), p1: (KotlinTarget..KotlinTarget?), p2: (KotlinTarget..KotlinTarget?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'FUNCTION' @ [155:86] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'PROPERTY_GETTER' @ [156:86] ==> enum entry PROPERTY_GETTER defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'PROPERTY_SETTER' @ [157:86] ==> enum entry PROPERTY_SETTER defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'to' @ [158:41] ==> public infix fun <A, B> String.to(that: (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)): Pair<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>..java.util.EnumSet<(org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)>?)

'of' @ [158:70] ==> public open fun <E : (Enum<(KotlinTarget..KotlinTarget?)>..Enum<(KotlinTarget..KotlinTarget?)>?)> of(p0: (KotlinTarget..KotlinTarget?)): (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> (org.jetbrains.kotlin.descriptors.annotations.KotlinTarget..org.jetbrains.kotlin.descriptors.annotations.KotlinTarget?)

'TYPE' @ [158:86] ==> enum entry TYPE defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'targetNameLists' @ [161:81] ==> private final val targetNameLists: Map<String, (EnumSet<(KotlinTarget..KotlinTarget?)>..EnumSet<(KotlinTarget..KotlinTarget?)>?)> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper[PropertyDescriptorImpl]

'argumentName' @ [161:97] ==> value-parameter argumentName: String? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaTargetArgumentByName[ValueParameterDescriptorImpl]

'emptySet' @ [161:114] ==> public fun <T> emptySet(): Set<KotlinTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinTarget

'arguments' @ [165:29] ==> value-parameter arguments: List<JavaAnnotationArgument> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaTargetArguments[ValueParameterDescriptorImpl]

'filterIsInstance' @ [165:39] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<JavaEnumValueAnnotationArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> JavaEnumValueAnnotationArgument

'flatMap' @ [166:18] ==> public inline fun <T, R> Iterable<JavaEnumValueAnnotationArgument>.flatMap(transform: (JavaEnumValueAnnotationArgument) -> Iterable<KotlinTarget>): List<KotlinTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaEnumValueAnnotationArgument
    <R> -> KotlinTarget

'mapJavaTargetArgumentByName' @ [166:28] ==> public final fun mapJavaTargetArgumentByName(argumentName: String?): Set<KotlinTarget> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper[SimpleFunctionDescriptorImpl]

'it' @ [166:56] ==> value-parameter it: JavaEnumValueAnnotationArgument defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaTargetArguments.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [166:59] ==> public abstract fun resolve(): JavaField? defined in org.jetbrains.kotlin.load.java.structure.JavaEnumValueAnnotationArgument[SimpleFunctionDescriptorImpl]

'name' @ [166:70] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'asString' @ [166:76] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'mapNotNull' @ [167:18] ==> public inline fun <T, R : Any> Iterable<KotlinTarget>.mapNotNull(transform: (KotlinTarget) -> ClassDescriptor?): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinTarget
    <R : Any> -> ClassDescriptor

'builtIns' @ [167:31] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaTargetArguments[ValueParameterDescriptorImpl]

'getAnnotationTargetEnumEntry' @ [167:40] ==> @Nullable public open fun getAnnotationTargetEnumEntry(@NotNull target: KotlinTarget): ClassDescriptor? defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [167:69] ==> value-parameter it: KotlinTarget defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaTargetArguments.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [168:18] ==> public inline fun <T, R> Iterable<ClassDescriptor>.map(transform: (ClassDescriptor) -> EnumValue): List<EnumValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> EnumValue

'EnumValue' @ [168:24] ==> public constructor EnumValue(value: ClassDescriptor) defined in org.jetbrains.kotlin.resolve.constants.EnumValue[ClassConstructorDescriptorImpl]

'getAnnotationParameterByName' @ [169:59] ==> @Nullable public open fun getAnnotationParameterByName(@NotNull name: Name, @NotNull annotationClass: ClassDescriptor): ValueParameterDescriptor? defined in org.jetbrains.kotlin.load.java.components.DescriptorResolverUtils[JavaMethodDescriptor]

'TARGET_ANNOTATION_ALLOWED_TARGETS' @ [170:38] ==> internal final val TARGET_ANNOTATION_ALLOWED_TARGETS: Name defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[PropertyDescriptorImpl]

'builtIns' @ [171:17] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaTargetArguments[ValueParameterDescriptorImpl]

'getBuiltInClassByFqName' @ [171:26] ==> @NotNull public open fun getBuiltInClassByFqName(@NotNull fqName: FqName): ClassDescriptor defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'FQ_NAMES' @ [171:65] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'target' @ [171:74] ==> public final val target: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'ArrayValue' @ [173:16] ==> public constructor ArrayValue(value: List<ConstantValue<*>>, type: KotlinType, builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.resolve.constants.ArrayValue[ClassConstructorDescriptorImpl]

'kotlinTargets' @ [173:27] ==> val kotlinTargets: List<EnumValue> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaTargetArguments[LocalVariableDescriptor]

'parameterDescriptor' @ [173:42] ==> val parameterDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaTargetArguments[LocalVariableDescriptor]

'type' @ [173:63] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'createErrorType' @ [173:82] ==> @NotNull public open fun createErrorType(@NotNull debugMessage: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'builtIns' @ [173:128] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaTargetArguments[ValueParameterDescriptorImpl]

'mapOf' @ [176:37] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, KotlinRetention>): Map<String, KotlinRetention> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> KotlinRetention

'to' @ [177:13] ==> public infix fun <A, B> String.to(that: KotlinRetention): Pair<String, KotlinRetention> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> KotlinRetention

'RUNTIME' @ [177:42] ==> enum entry RUNTIME defined in org.jetbrains.kotlin.descriptors.annotations.KotlinRetention[FakeCallableDescriptorForObject]

'to' @ [178:13] ==> public infix fun <A, B> String.to(that: KotlinRetention): Pair<String, KotlinRetention> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> KotlinRetention

'BINARY' @ [178:42] ==> enum entry BINARY defined in org.jetbrains.kotlin.descriptors.annotations.KotlinRetention[FakeCallableDescriptorForObject]

'to' @ [179:13] ==> public infix fun <A, B> String.to(that: KotlinRetention): Pair<String, KotlinRetention> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> KotlinRetention

'SOURCE' @ [179:42] ==> enum entry SOURCE defined in org.jetbrains.kotlin.descriptors.annotations.KotlinRetention[FakeCallableDescriptorForObject]

'element' @ [184:17] ==> value-parameter element: JavaAnnotationArgument? defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaRetentionArgument[ValueParameterDescriptorImpl]

'let' @ [184:63] ==> @InlineOnly public inline fun <T, R> JavaEnumValueAnnotationArgument.let(block: (JavaEnumValueAnnotationArgument) -> EnumValue?): EnumValue? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaEnumValueAnnotationArgument
    <R> -> EnumValue?

'retentionNameList' @ [185:13] ==> private final val retentionNameList: Map<String, KotlinRetention> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper[PropertyDescriptorImpl]

'it' @ [185:31] ==> value-parameter it: JavaEnumValueAnnotationArgument defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaRetentionArgument.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [185:34] ==> public abstract fun resolve(): JavaField? defined in org.jetbrains.kotlin.load.java.structure.JavaEnumValueAnnotationArgument[SimpleFunctionDescriptorImpl]

'name' @ [185:45] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'asString' @ [185:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'let' @ [185:64] ==> @InlineOnly public inline fun <T, R> KotlinRetention.let(block: (KotlinRetention) -> EnumValue?): EnumValue? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinRetention
    <R> -> EnumValue?

'builtIns' @ [186:17] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaRetentionArgument[ValueParameterDescriptorImpl]

'getAnnotationRetentionEnumEntry' @ [186:26] ==> @Nullable public open fun getAnnotationRetentionEnumEntry(@NotNull retention: KotlinRetention): ClassDescriptor? defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [186:58] ==> value-parameter it: KotlinRetention defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationTargetMapper.mapJavaRetentionArgument.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [186:63] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> EnumValue): EnumValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> EnumValue

'EnumValue' @ [186:69] ==> public constructor EnumValue(value: ClassDescriptor) defined in org.jetbrains.kotlin.resolve.constants.EnumValue[ClassConstructorDescriptorImpl]

