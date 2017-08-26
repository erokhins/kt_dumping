'LazyJavaStaticScope' @ [43:5] ==> public constructor LazyJavaStaticScope(c: LazyJavaResolverContext) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticScope[ClassConstructorDescriptorImpl]

'c' @ [43:25] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'c' @ [46:76] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [46:78] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createNullableLazyValue' @ [46:93] ==> public abstract fun <T : Any> createNullableLazyValue(computable: () -> Set<(String..String?)>?): NullableLazyValue<Set<(String..String?)>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Set<(kotlin.String..kotlin.String?)>

'c' @ [47:9] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'components' @ [47:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'finder' @ [47:22] ==> public final val finder: JavaClassFinder defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'knownClassNamesInPackage' @ [47:29] ==> @ReadOnly @Nullable public abstract fun knownClassNamesInPackage(@NotNull packageFqName: FqName): Set<(String..String?)>? defined in org.jetbrains.kotlin.load.java.JavaClassFinder[JavaMethodDescriptor]

'ownerDescriptor' @ [47:54] ==> protected open val ownerDescriptor: LazyJavaPackageFragment defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[PropertyDescriptorImpl]

'fqName' @ [47:70] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[DeserializedPropertyDescriptor]

'c' @ [50:27] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [50:29] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [50:44] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (LazyJavaPackageScope.FindClassRequest) -> ClassDescriptor?): MemoizedFunctionToNullable<LazyJavaPackageScope.FindClassRequest, ClassDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FindClassRequest
    <V : Any> -> ClassDescriptor

'ClassId' @ [51:30] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'ownerDescriptor' @ [51:38] ==> protected open val ownerDescriptor: LazyJavaPackageFragment defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[PropertyDescriptorImpl]

'fqName' @ [51:54] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[DeserializedPropertyDescriptor]

'request' @ [51:62] ==> value-parameter request: LazyJavaPackageScope.FindClassRequest defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [51:70] ==> public final val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest[PropertyDescriptorImpl]

'if (request.javaClass != null)
                    c.components.kotlinClassFinder.findKotlinClass(request.javaClass)
                else
                    c.components.kotlinClassFinder.findKotlinClass(requestClassId)' @ [55:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinJvmBinaryClass?, elseBranch: KotlinJvmBinaryClass?): KotlinJvmBinaryClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinJvmBinaryClass?

'request' @ [55:21] ==> value-parameter request: LazyJavaPackageScope.FindClassRequest defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [55:29] ==> public final val javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest[PropertyDescriptorImpl]

'c' @ [56:21] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'components' @ [56:23] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'kotlinClassFinder' @ [56:34] ==> public final val kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findKotlinClass' @ [56:52] ==> public abstract fun findKotlinClass(javaClass: JavaClass): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinClassFinder[SimpleFunctionDescriptorImpl]

'request' @ [56:68] ==> value-parameter request: LazyJavaPackageScope.FindClassRequest defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [56:76] ==> public final val javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest[PropertyDescriptorImpl]

'c' @ [58:21] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'components' @ [58:23] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'kotlinClassFinder' @ [58:34] ==> public final val kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findKotlinClass' @ [58:52] ==> public abstract fun findKotlinClass(classId: ClassId): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinClassFinder[SimpleFunctionDescriptorImpl]

'requestClassId' @ [58:68] ==> val requestClassId: ClassId defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'kotlinBinaryClass' @ [60:23] ==> val kotlinBinaryClass: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'classId' @ [60:42] ==> public abstract val classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'classId' @ [63:13] ==> val classId: ClassId? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'classId' @ [63:33] ==> val classId: ClassId? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'isNestedClass' @ [63:41] ==> public final val ClassId.isNestedClass: Boolean[MyPropertyDescriptor]

'classId' @ [63:58] ==> val classId: ClassId? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'isLocal' @ [63:66] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'resolveKotlinBinaryClass' @ [65:28] ==> private final fun resolveKotlinBinaryClass(kotlinClass: KotlinJvmBinaryClass?): LazyJavaPackageScope.KotlinClassLookupResult defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[SimpleFunctionDescriptorImpl]

'kotlinBinaryClass' @ [65:53] ==> val kotlinBinaryClass: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'when (kotlinResult) {
            is KotlinClassLookupResult.Found -> kotlinResult.descriptor
            is KotlinClassLookupResult.SyntheticClass -> null
            is KotlinClassLookupResult.NotFound -> {
                val javaClass = request.javaClass ?: c.components.finder.findClass(requestClassId)

                if (javaClass?.lightClassOriginKind == LightClassOriginKind.BINARY) {
                    throw IllegalStateException(
                            "Couldn't find kotlin binary class for light class created by kotlin binary file\n" +
                            "JavaClass: $javaClass\n" +
                            "ClassId: $requestClassId\n" +
                            "findKotlinClass(JavaClass) = ${c.components.kotlinClassFinder.findKotlinClass(javaClass)}\n" +
                            "findKotlinClass(ClassId) = ${c.components.kotlinClassFinder.findKotlinClass(requestClassId)}\n"
                    )
                }

                val actualFqName = javaClass?.fqName
                if (actualFqName == null || actualFqName.isRoot || actualFqName.parent() != ownerDescriptor.fqName)
                    null
                else
                    LazyJavaClassDescriptor(c, ownerDescriptor, javaClass)
            }
        }' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor?, entry1: ClassDescriptor?, entry2: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor?

'kotlinResult' @ [67:15] ==> val kotlinResult: LazyJavaPackageScope.KotlinClassLookupResult defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'kotlinResult' @ [68:49] ==> val kotlinResult: LazyJavaPackageScope.KotlinClassLookupResult defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [68:62] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found[PropertyDescriptorImpl]

'request' @ [71:33] ==> value-parameter request: LazyJavaPackageScope.FindClassRequest defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [71:41] ==> public final val javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest[PropertyDescriptorImpl]

'c' @ [71:54] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'components' @ [71:56] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'finder' @ [71:67] ==> public final val finder: JavaClassFinder defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findClass' @ [71:74] ==> @Nullable public abstract fun findClass(@NotNull classId: ClassId): JavaClass? defined in org.jetbrains.kotlin.load.java.JavaClassFinder[JavaMethodDescriptor]

'requestClassId' @ [71:84] ==> val requestClassId: ClassId defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'javaClass' @ [73:21] ==> val javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'lightClassOriginKind' @ [73:32] ==> public abstract val lightClassOriginKind: LightClassOriginKind? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'BINARY' @ [73:77] ==> enum entry BINARY defined in org.jetbrains.kotlin.load.java.structure.LightClassOriginKind[FakeCallableDescriptorForObject]

'IllegalStateException' @ [74:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [75:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'javaClass' @ [76:42] ==> val javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'requestClassId' @ [77:40] ==> val requestClassId: ClassId defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'c' @ [78:61] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'components' @ [78:63] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'kotlinClassFinder' @ [78:74] ==> public final val kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findKotlinClass' @ [78:92] ==> public abstract fun findKotlinClass(javaClass: JavaClass): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinClassFinder[SimpleFunctionDescriptorImpl]

'javaClass' @ [78:108] ==> val javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'c' @ [79:59] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'components' @ [79:61] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'kotlinClassFinder' @ [79:72] ==> public final val kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findKotlinClass' @ [79:90] ==> public abstract fun findKotlinClass(classId: ClassId): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinClassFinder[SimpleFunctionDescriptorImpl]

'requestClassId' @ [79:106] ==> val requestClassId: ClassId defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'javaClass' @ [83:36] ==> val javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'fqName' @ [83:47] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'if (actualFqName == null || actualFqName.isRoot || actualFqName.parent() != ownerDescriptor.fqName)
                    null
                else
                    LazyJavaClassDescriptor(c, ownerDescriptor, javaClass)' @ [84:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LazyJavaClassDescriptor?, elseBranch: LazyJavaClassDescriptor?): LazyJavaClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LazyJavaClassDescriptor?

'actualFqName' @ [84:21] ==> val actualFqName: FqName? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'actualFqName' @ [84:45] ==> val actualFqName: FqName? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'isRoot' @ [84:58] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'actualFqName' @ [84:68] ==> val actualFqName: FqName? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'parent' @ [84:81] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'ownerDescriptor' @ [84:93] ==> protected open val ownerDescriptor: LazyJavaPackageFragment defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[PropertyDescriptorImpl]

'fqName' @ [84:109] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[DeserializedPropertyDescriptor]

'LazyJavaClassDescriptor' @ [87:21] ==> public constructor LazyJavaClassDescriptor(outerContext: LazyJavaResolverContext, containingDeclaration: DeclarationDescriptor, jClass: JavaClass, additionalSupertypeClassDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[ClassConstructorDescriptorImpl]

'c' @ [87:45] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.<init>[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [87:48] ==> protected open val ownerDescriptor: LazyJavaPackageFragment defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[PropertyDescriptorImpl]

'javaClass' @ [87:65] ==> val javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.classes.<anonymous>[LocalVariableDescriptor]

'KotlinClassLookupResult' @ [93:56] ==> private constructor KotlinClassLookupResult() defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult[ClassConstructorDescriptorImpl]

'KotlinClassLookupResult' @ [94:27] ==> private constructor KotlinClassLookupResult() defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult[ClassConstructorDescriptorImpl]

'KotlinClassLookupResult' @ [95:33] ==> private constructor KotlinClassLookupResult() defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult[ClassConstructorDescriptorImpl]

'when {
                kotlinClass == null -> {
                    KotlinClassLookupResult.NotFound
                }
                kotlinClass.classHeader.kind == KotlinClassHeader.Kind.CLASS -> {
                    val descriptor = c.components.deserializedDescriptorResolver.resolveClass(kotlinClass)
                    if (descriptor != null) KotlinClassLookupResult.Found(descriptor) else KotlinClassLookupResult.NotFound
                }
                else -> {
                    // This is a package or interface DefaultImpls or something like that
                    KotlinClassLookupResult.SyntheticClass
                }
            }' @ [99:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LazyJavaPackageScope.KotlinClassLookupResult, entry1: LazyJavaPackageScope.KotlinClassLookupResult, entry2: LazyJavaPackageScope.KotlinClassLookupResult): LazyJavaPackageScope.KotlinClassLookupResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinClassLookupResult

'kotlinClass' @ [100:17] ==> value-parameter kotlinClass: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.resolveKotlinBinaryClass[ValueParameterDescriptorImpl]

'NotFound' @ [101:45] ==> public object NotFound : LazyJavaPackageScope.KotlinClassLookupResult defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult[FakeCallableDescriptorForObject]

'kotlinClass' @ [103:17] ==> value-parameter kotlinClass: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.resolveKotlinBinaryClass[ValueParameterDescriptorImpl]

'classHeader' @ [103:29] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'kind' @ [103:41] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'CLASS' @ [103:72] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'c' @ [104:38] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[PropertyDescriptorImpl]

'components' @ [104:40] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'deserializedDescriptorResolver' @ [104:51] ==> public final val deserializedDescriptorResolver: DeserializedDescriptorResolver defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'resolveClass' @ [104:82] ==> public final fun resolveClass(kotlinClass: KotlinJvmBinaryClass): ClassDescriptor? defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [104:95] ==> value-parameter kotlinClass: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.resolveKotlinBinaryClass[ValueParameterDescriptorImpl]

'if (descriptor != null) KotlinClassLookupResult.Found(descriptor) else KotlinClassLookupResult.NotFound' @ [105:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LazyJavaPackageScope.KotlinClassLookupResult, elseBranch: LazyJavaPackageScope.KotlinClassLookupResult): LazyJavaPackageScope.KotlinClassLookupResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinClassLookupResult

'descriptor' @ [105:25] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.resolveKotlinBinaryClass[LocalVariableDescriptor]

'Found' @ [105:69] ==> public constructor Found(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found[ClassConstructorDescriptorImpl]

'descriptor' @ [105:75] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.resolveKotlinBinaryClass[LocalVariableDescriptor]

'NotFound' @ [105:116] ==> public object NotFound : LazyJavaPackageScope.KotlinClassLookupResult defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult[FakeCallableDescriptorForObject]

'SyntheticClass' @ [109:45] ==> public object SyntheticClass : LazyJavaPackageScope.KotlinClassLookupResult defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult[FakeCallableDescriptorForObject]

'other' @ [115:44] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest.equals[ValueParameterDescriptorImpl]

'name' @ [115:73] ==> public final val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest[PropertyDescriptorImpl]

'other' @ [115:81] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest.equals[ValueParameterDescriptorImpl]

'name' @ [115:87] ==> public final val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest[PropertyDescriptorImpl]

'name' @ [117:35] ==> public final val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest[PropertyDescriptorImpl]

'hashCode' @ [117:40] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'findClassifier' @ [120:83] ==> private final fun findClassifier(name: Name, javaClass: JavaClass?): ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[SimpleFunctionDescriptorImpl]

'name' @ [120:98] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.getContributedClassifier[ValueParameterDescriptorImpl]

'!' @ [123:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSafeIdentifier' @ [123:27] ==> public open fun isSafeIdentifier(@NotNull p0: Name): Boolean defined in org.jetbrains.kotlin.name.SpecialNames[JavaMethodDescriptor]

'name' @ [123:44] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.findClassifier[ValueParameterDescriptorImpl]

'invoke' @ [125:40] ==> public abstract fun invoke(): Set<String>? defined in org.jetbrains.kotlin.storage.NullableLazyValue[FunctionInvokeDescriptor]

'javaClass' @ [126:13] ==> value-parameter javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.findClassifier[ValueParameterDescriptorImpl]

'knownClassNamesInPackage' @ [126:34] ==> val knownClassNamesInPackage: Set<String>? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.findClassifier[LocalVariableDescriptor]

'name' @ [126:70] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.findClassifier[ValueParameterDescriptorImpl]

'asString' @ [126:75] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'knownClassNamesInPackage' @ [126:90] ==> val knownClassNamesInPackage: Set<String>? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.findClassifier[LocalVariableDescriptor]

'invoke' @ [130:16] ==> public abstract fun invoke(p1: LazyJavaPackageScope.FindClassRequest): ClassDescriptor? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'FindClassRequest' @ [130:24] ==> public constructor FindClassRequest(name: Name, javaClass: JavaClass?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest[ClassConstructorDescriptorImpl]

'name' @ [130:41] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.findClassifier[ValueParameterDescriptorImpl]

'javaClass' @ [130:47] ==> value-parameter javaClass: JavaClass? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.findClassifier[ValueParameterDescriptorImpl]

'findClassifier' @ [133:68] ==> private final fun findClassifier(name: Name, javaClass: JavaClass?): ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[SimpleFunctionDescriptorImpl]

'javaClass' @ [133:83] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.findClassifierByJavaClass[ValueParameterDescriptorImpl]

'name' @ [133:93] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'javaClass' @ [133:99] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.findClassifierByJavaClass[ValueParameterDescriptorImpl]

'emptyList' @ [135:114] ==> public fun <T> emptyList(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'Empty' @ [137:82] ==> public object Empty : DeclaredMemberIndex defined in org.jetbrains.kotlin.load.java.lazy.descriptors.DeclaredMemberIndex[FakeCallableDescriptorForObject]

'!' @ [141:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [141:14] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.computeClassNames[ValueParameterDescriptorImpl]

'acceptsKinds' @ [141:25] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [141:38] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'NON_SINGLETON_CLASSIFIERS_MASK' @ [141:59] ==> public final val NON_SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'emptySet' @ [141:99] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'invoke' @ [143:40] ==> public abstract fun invoke(): Set<String>? defined in org.jetbrains.kotlin.storage.NullableLazyValue[FunctionInvokeDescriptor]

'knownClassNamesInPackage' @ [144:13] ==> val knownClassNamesInPackage: Set<String>? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.computeClassNames[LocalVariableDescriptor]

'knownClassNamesInPackage' @ [144:54] ==> val knownClassNamesInPackage: Set<String>? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.computeClassNames[LocalVariableDescriptor]

'mapTo' @ [144:79] ==> public inline fun <T, R, C : MutableCollection<in Name>> Iterable<String>.mapTo(destination: HashSet<Name>, transform: (String) -> Name): HashSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Name
    <C : MutableCollection<in R>> -> HashSet<Name>

'HashSet' @ [144:85] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Name

'identifier' @ [144:103] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [144:114] ==> value-parameter it: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.computeClassNames.<anonymous>[ValueParameterDescriptorImpl]

'jPackage' @ [146:16] ==> private final val jPackage: JavaPackage defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[PropertyDescriptorImpl]

'getClasses' @ [146:25] ==> public abstract fun getClasses(nameFilter: (Name) -> Boolean): Collection<JavaClass> defined in org.jetbrains.kotlin.load.java.structure.JavaPackage[SimpleFunctionDescriptorImpl]

'nameFilter' @ [146:36] ==> value-parameter nameFilter: ((Name) -> Boolean)? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.computeClassNames[ValueParameterDescriptorImpl]

'alwaysTrue' @ [146:50] ==> public fun <T> alwaysTrue(): (Name) -> Boolean defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'mapNotNullTo' @ [146:64] ==> public inline fun <T, R : Any, C : MutableCollection<in Name>> Iterable<JavaClass>.mapNotNullTo(destination: LinkedHashSet<Name> /* = LinkedHashSet<Name> */, transform: (JavaClass) -> Name?): LinkedHashSet<Name> /* = LinkedHashSet<Name> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R : Any> -> Name
    <C : MutableCollection<in R>> -> LinkedHashSet<Name>

'linkedSetOf' @ [146:77] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<Name> /* = LinkedHashSet<Name> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'if (klass.lightClassOriginKind == LightClassOriginKind.SOURCE) null else klass.name' @ [147:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'klass' @ [147:17] ==> value-parameter klass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.computeClassNames.<anonymous>[ValueParameterDescriptorImpl]

'lightClassOriginKind' @ [147:23] ==> public abstract val lightClassOriginKind: LightClassOriginKind? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'SOURCE' @ [147:68] ==> enum entry SOURCE defined in org.jetbrains.kotlin.load.java.structure.LightClassOriginKind[FakeCallableDescriptorForObject]

'klass' @ [147:86] ==> value-parameter klass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.computeClassNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [147:92] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'emptySet' @ [152:16] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'emptySet' @ [158:109] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'computeDescriptors' @ [162:16] ==> protected final fun computeDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, location: LookupLocation): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [162:35] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [162:47] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'WHEN_GET_ALL_DESCRIPTORS' @ [162:76] ==> enum entry WHEN_GET_ALL_DESCRIPTORS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

