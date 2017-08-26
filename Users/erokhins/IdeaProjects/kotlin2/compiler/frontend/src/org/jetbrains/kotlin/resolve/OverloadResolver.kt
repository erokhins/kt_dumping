'findConstructorsInNestedClassesAndTypeAliases' @ [38:25] ==> private final fun findConstructorsInNestedClassesAndTypeAliases(c: BodiesResolveContext): MultiMap<ClassDescriptor, FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'c' @ [38:71] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloads[ValueParameterDescriptorImpl]

'c' @ [40:23] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloads[ValueParameterDescriptorImpl]

'declaredClasses' @ [40:25] ==> public final val BodiesResolveContext.declaredClasses: (MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'values' @ [40:41] ==> public abstract val values: MutableCollection<(ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'checkOverloadsInClass' @ [41:13] ==> private final fun checkOverloadsInClass(classDescriptor: ClassDescriptorWithResolutionScopes, nestedClassConstructors: Collection<FunctionDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'value' @ [41:35] ==> val value: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloads[LocalVariableDescriptor]

'inClasses' @ [41:42] ==> val inClasses: MultiMap<ClassDescriptor, FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloads[LocalVariableDescriptor]

'get' @ [41:52] ==> @NotNull public open operator fun get(p0: (ClassDescriptor..ClassDescriptor?)): (MutableCollection<(FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'value' @ [41:56] ==> val value: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloads[LocalVariableDescriptor]

'checkOverloadsInPackages' @ [43:9] ==> private final fun checkOverloadsInPackages(c: BodiesResolveContext): Unit defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'c' @ [43:34] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloads[ValueParameterDescriptorImpl]

'create' @ [47:49] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(): MultiMap<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassDescriptor
    <V : (Any..Any?)> -> FunctionDescriptor

'c' @ [49:23] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[ValueParameterDescriptorImpl]

'declaredClasses' @ [49:25] ==> public final val BodiesResolveContext.declaredClasses: (MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'values' @ [49:41] ==> public abstract val values: MutableCollection<(ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'klass' @ [50:17] ==> val klass: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'kind' @ [50:23] ==> public final val ClassDescriptorWithResolutionScopes.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [50:28] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'klass' @ [50:43] ==> val klass: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'name' @ [50:49] ==> public final val ClassDescriptorWithResolutionScopes.name: Name[MyPropertyDescriptor]

'isSpecial' @ [50:54] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'klass' @ [54:41] ==> val klass: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'containingDeclaration' @ [54:47] ==> public final val ClassDescriptorWithResolutionScopes.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (containingDeclaration is ScriptDescriptor) {
                // TODO: check overload conflicts of functions with constructors in scripts
            }
            else if (containingDeclaration is ClassDescriptor) {
                constructorsByOuterClass.putValues(containingDeclaration, klass.constructors)
            }
            else if (!(containingDeclaration is FunctionDescriptor ||
                       containingDeclaration is PropertyDescriptor ||
                       containingDeclaration is PackageFragmentDescriptor)) {
                throw IllegalStateException("Illegal class container: " + containingDeclaration)
            }' @ [55:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'containingDeclaration' @ [55:17] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'if (containingDeclaration is ClassDescriptor) {
                constructorsByOuterClass.putValues(containingDeclaration, klass.constructors)
            }
            else if (!(containingDeclaration is FunctionDescriptor ||
                       containingDeclaration is PropertyDescriptor ||
                       containingDeclaration is PackageFragmentDescriptor)) {
                throw IllegalStateException("Illegal class container: " + containingDeclaration)
            }' @ [58:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'containingDeclaration' @ [58:22] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'constructorsByOuterClass' @ [59:17] ==> val constructorsByOuterClass: MultiMap<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'putValues' @ [59:42] ==> public open fun putValues(p0: (ClassDescriptor..ClassDescriptor?), @NotNull p1: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'containingDeclaration' @ [59:52] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'klass' @ [59:75] ==> val klass: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'constructors' @ [59:81] ==> public final val ClassDescriptorWithResolutionScopes.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'!' @ [61:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [61:24] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'containingDeclaration' @ [62:24] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'containingDeclaration' @ [63:24] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'IllegalStateException' @ [64:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [64:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [64:75] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'c' @ [68:27] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[ValueParameterDescriptorImpl]

'typeAliases' @ [68:29] ==> public final val BodiesResolveContext.typeAliases: (MutableMap<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>..MutableMap<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>?)[MyPropertyDescriptor]

'values' @ [68:41] ==> public abstract val values: MutableCollection<(TypeAliasDescriptor..TypeAliasDescriptor?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'typeAlias' @ [69:41] ==> val typeAlias: (TypeAliasDescriptor..TypeAliasDescriptor?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'containingDeclaration' @ [69:51] ==> public final val TypeAliasDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [70:17] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'constructorsByOuterClass' @ [71:17] ==> val constructorsByOuterClass: MultiMap<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'putValues' @ [71:42] ==> public open fun putValues(p0: (ClassDescriptor..ClassDescriptor?), @NotNull p1: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'containingDeclaration' @ [71:52] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'typeAlias' @ [71:75] ==> val typeAlias: (TypeAliasDescriptor..TypeAliasDescriptor?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'constructors' @ [71:85] ==> public abstract val constructors: Collection<TypeAliasConstructorDescriptor> defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'constructorsByOuterClass' @ [75:16] ==> val constructorsByOuterClass: MultiMap<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverloadResolver.findConstructorsInNestedClassesAndTypeAliases[LocalVariableDescriptor]

'groupModulePackageMembersByFqName' @ [79:29] ==> private final fun groupModulePackageMembersByFqName(c: BodiesResolveContext, overloadFilter: OverloadFilter): MultiMap<FqNameUnsafe, DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'c' @ [79:63] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackages[ValueParameterDescriptorImpl]

'overloadFilter' @ [79:66] ==> private final val overloadFilter: OverloadFilter defined in org.jetbrains.kotlin.resolve.OverloadResolver[PropertyDescriptorImpl]

'membersByName' @ [81:19] ==> val membersByName: MultiMap<FqNameUnsafe, DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackages[LocalVariableDescriptor]

'entrySet' @ [81:33] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(FqNameUnsafe..FqNameUnsafe?), (MutableCollection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>..Collection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>?)>..Map.Entry<(FqNameUnsafe..FqNameUnsafe?), (MutableCollection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>..Collection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>?)>?)>..Set<(MutableMap.MutableEntry<(FqNameUnsafe..FqNameUnsafe?), (MutableCollection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>..Collection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>?)>..Map.Entry<(FqNameUnsafe..FqNameUnsafe?), (MutableCollection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>..Collection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'checkOverloadsInPackage' @ [82:13] ==> private final fun checkOverloadsInPackage(members: Collection<DeclarationDescriptorNonRoot>): Unit defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'e' @ [82:37] ==> val e: (MutableMap.MutableEntry<(FqNameUnsafe..FqNameUnsafe?), (MutableCollection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>..Collection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>?)>..Map.Entry<(FqNameUnsafe..FqNameUnsafe?), (MutableCollection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>..Collection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>?)>?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackages[LocalVariableDescriptor]

'value' @ [82:39] ==> public abstract val value: (MutableCollection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>..Collection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'MultiMap' @ [90:36] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqNameUnsafe
    <V : (Any..Any?)> -> DeclarationDescriptorNonRoot

'collectModulePackageMembersWithSameName' @ [92:9] ==> private final inline fun collectModulePackageMembersWithSameName(packageMembersByName: MultiMap<FqNameUnsafe, DeclarationDescriptorNonRoot>, interestingDescriptors: Collection<DeclarationDescriptor>, overloadFilter: OverloadFilter, getMembersByName: (MemberScope, Name) -> Collection<DeclarationDescriptorNonRoot>): Unit defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'packageMembersByName' @ [93:17] ==> val packageMembersByName: MultiMap<FqNameUnsafe, DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName[LocalVariableDescriptor]

'+' @ [94:17] ==> public operator fun <T> Collection<(DeclarationDescriptor..DeclarationDescriptor?)>.plus(elements: Iterable<(DeclarationDescriptor..DeclarationDescriptor?)>): List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'c' @ [94:18] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName[ValueParameterDescriptorImpl]

'functions' @ [94:20] ==> public final val BodiesResolveContext.functions: (MutableMap<(KtNamedFunction..KtNamedFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..MutableMap<(KtNamedFunction..KtNamedFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?)[MyPropertyDescriptor]

'values' @ [94:30] ==> public abstract val values: MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'c' @ [94:77] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName[ValueParameterDescriptorImpl]

'declaredClasses' @ [94:79] ==> public final val BodiesResolveContext.declaredClasses: (MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'values' @ [94:95] ==> public abstract val values: MutableCollection<(ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'c' @ [94:104] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName[ValueParameterDescriptorImpl]

'typeAliases' @ [94:106] ==> public final val BodiesResolveContext.typeAliases: (MutableMap<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>..MutableMap<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>?)[MyPropertyDescriptor]

'values' @ [94:118] ==> public abstract val values: MutableCollection<(TypeAliasDescriptor..TypeAliasDescriptor?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'overloadFilter' @ [95:17] ==> value-parameter overloadFilter: OverloadFilter defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName[ValueParameterDescriptorImpl]

'scope' @ [98:29] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [98:35] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [98:59] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[ValueParameterDescriptorImpl]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [98:82] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'scope' @ [99:30] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [99:36] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [99:61] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[ValueParameterDescriptorImpl]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [99:84] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'when (classifier) {
                is ClassDescriptor ->
                    if (!classifier.kind.isSingleton)
                        functions + classifier.constructors
                    else
                        functions
                is TypeAliasDescriptor ->
                    functions + classifier.constructors
                else ->
                    functions
            }' @ [100:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<DeclarationDescriptorNonRoot>, entry1: Collection<DeclarationDescriptorNonRoot>, entry2: Collection<DeclarationDescriptorNonRoot>): Collection<DeclarationDescriptorNonRoot>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<DeclarationDescriptorNonRoot>

'classifier' @ [100:19] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'if (!classifier.kind.isSingleton)
                        functions + classifier.constructors
                    else
                        functions' @ [102:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<(FunctionDescriptor..FunctionDescriptor?)>, elseBranch: Collection<(FunctionDescriptor..FunctionDescriptor?)>): Collection<(FunctionDescriptor..FunctionDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'!' @ [102:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classifier' @ [102:26] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'kind' @ [102:37] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [102:42] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'functions' @ [103:25] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'classifier' @ [103:37] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'constructors' @ [103:48] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'functions' @ [105:25] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'functions' @ [107:21] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'classifier' @ [107:33] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'constructors' @ [107:44] ==> public abstract val constructors: Collection<TypeAliasConstructorDescriptor> defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'functions' @ [109:21] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'collectModulePackageMembersWithSameName' @ [113:9] ==> private final inline fun collectModulePackageMembersWithSameName(packageMembersByName: MultiMap<FqNameUnsafe, DeclarationDescriptorNonRoot>, interestingDescriptors: Collection<DeclarationDescriptor>, overloadFilter: OverloadFilter, getMembersByName: (MemberScope, Name) -> Collection<DeclarationDescriptorNonRoot>): Unit defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'packageMembersByName' @ [113:49] ==> val packageMembersByName: MultiMap<FqNameUnsafe, DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName[LocalVariableDescriptor]

'c' @ [113:71] ==> value-parameter c: BodiesResolveContext defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName[ValueParameterDescriptorImpl]

'properties' @ [113:73] ==> public final val BodiesResolveContext.properties: (MutableMap<(KtProperty..KtProperty?), (PropertyDescriptor..PropertyDescriptor?)>..MutableMap<(KtProperty..KtProperty?), (PropertyDescriptor..PropertyDescriptor?)>?)[MyPropertyDescriptor]

'values' @ [113:84] ==> public abstract val values: MutableCollection<(PropertyDescriptor..PropertyDescriptor?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'overloadFilter' @ [113:92] ==> value-parameter overloadFilter: OverloadFilter defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName[ValueParameterDescriptorImpl]

'scope' @ [115:29] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [115:35] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [115:59] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[ValueParameterDescriptorImpl]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [115:82] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'scope' @ [116:30] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [116:36] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [116:61] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[ValueParameterDescriptorImpl]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [116:84] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'variables' @ [117:13] ==> val variables: Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'listOfNotNull' @ [117:25] ==> public fun <T : Any> listOfNotNull(element: ClassifierDescriptor?): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassifierDescriptor

'classifier' @ [117:39] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName.<anonymous>[LocalVariableDescriptor]

'packageMembersByName' @ [120:16] ==> val packageMembersByName: MultiMap<FqNameUnsafe, DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.groupModulePackageMembersByFqName[LocalVariableDescriptor]

'hashSetOf' @ [129:28] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<FqNameUnsafe> /* = HashSet<FqNameUnsafe> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqNameUnsafe

'interestingDescriptors' @ [130:28] ==> value-parameter interestingDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'descriptor' @ [131:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[LocalVariableDescriptor]

'containingDeclaration' @ [131:28] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'getFqName' @ [133:49] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [133:59] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[LocalVariableDescriptor]

'observedFQNs' @ [134:17] ==> val observedFQNs: HashSet<FqNameUnsafe> /* = HashSet<FqNameUnsafe> */ defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[LocalVariableDescriptor]

'contains' @ [134:30] ==> public open fun contains(element: FqNameUnsafe): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'descriptorFQN' @ [134:39] ==> val descriptorFQN: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[LocalVariableDescriptor]

'observedFQNs' @ [135:13] ==> val observedFQNs: HashSet<FqNameUnsafe> /* = HashSet<FqNameUnsafe> */ defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[LocalVariableDescriptor]

'add' @ [135:26] ==> public open fun add(element: FqNameUnsafe): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'descriptorFQN' @ [135:30] ==> val descriptorFQN: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[LocalVariableDescriptor]

'getModulePackageMembersWithSameName' @ [137:46] ==> private final inline fun getModulePackageMembersWithSameName(descriptor: DeclarationDescriptor, overloadFilter: OverloadFilter, getMembersByName: (MemberScope, Name) -> Collection<DeclarationDescriptorNonRoot>): Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'descriptor' @ [137:82] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[LocalVariableDescriptor]

'overloadFilter' @ [137:94] ==> value-parameter overloadFilter: OverloadFilter defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'getMembersByName' @ [137:110] ==> value-parameter getMembersByName: (MemberScope, Name) -> Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'packageMembersByName' @ [138:13] ==> value-parameter packageMembersByName: MultiMap<FqNameUnsafe, DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'putValues' @ [138:34] ==> public open fun putValues(p0: (FqNameUnsafe..FqNameUnsafe?), @NotNull p1: (MutableCollection<out (DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>..Collection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'descriptorFQN' @ [138:44] ==> val descriptorFQN: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[LocalVariableDescriptor]

'packageMembersWithSameName' @ [138:59] ==> val packageMembersWithSameName: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.collectModulePackageMembersWithSameName[LocalVariableDescriptor]

'descriptor' @ [147:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'containingDeclaration' @ [147:44] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'containingPackage' @ [148:13] ==> val containingPackage: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[LocalVariableDescriptor]

'AssertionError' @ [149:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [149:36] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'?:' @ [152:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ModuleDescriptor?, right: ModuleDescriptor): ModuleDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ModuleDescriptor

'getContainingModuleOrNull' @ [152:48] ==> @Nullable public open fun getContainingModuleOrNull(@NotNull p0: DeclarationDescriptor): ModuleDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [152:74] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'when (descriptor) {
                                   is CallableMemberDescriptor -> listOf(descriptor)
                                   is ClassDescriptor -> descriptor.constructors
                                   else -> throw AssertionError("Unexpected descriptor kind: $descriptor")
                               }' @ [153:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<DeclarationDescriptorNonRoot>, entry1: Collection<DeclarationDescriptorNonRoot>, entry2: Collection<DeclarationDescriptorNonRoot>): Collection<DeclarationDescriptorNonRoot>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<DeclarationDescriptorNonRoot>

'descriptor' @ [153:45] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'listOf' @ [154:67] ==> public fun <T> listOf(element: CallableMemberDescriptor): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'descriptor' @ [154:74] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'descriptor' @ [155:58] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'constructors' @ [155:69] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'AssertionError' @ [156:50] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [156:95] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'containingModule' @ [159:38] ==> val containingModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[LocalVariableDescriptor]

'getPackage' @ [159:55] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'containingPackage' @ [159:66] ==> val containingPackage: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[LocalVariableDescriptor]

'fqName' @ [159:84] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'memberScope' @ [159:92] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'invoke' @ [161:17] ==> public abstract operator fun invoke(p1: MemberScope, p2: Name): Collection<DeclarationDescriptorNonRoot> defined in kotlin.Function2[FunctionInvokeDescriptor]

'containingPackageScope' @ [161:34] ==> val containingPackageScope: MemberScope defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[LocalVariableDescriptor]

'descriptor' @ [161:58] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'name' @ [161:69] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'filter' @ [161:75] ==> public inline fun <T> Iterable<DeclarationDescriptorNonRoot>.filter(predicate: (DeclarationDescriptorNonRoot) -> Boolean): List<DeclarationDescriptorNonRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptorNonRoot

'==' @ [163:21] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'getContainingModule' @ [163:37] ==> @NotNull public open fun getContainingModule(@NotNull p0: DeclarationDescriptor): ModuleDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [163:57] ==> value-parameter it: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName.<anonymous>[ValueParameterDescriptorImpl]

'containingModule' @ [163:64] ==> val containingModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[LocalVariableDescriptor]

'overloadFilter' @ [166:16] ==> value-parameter overloadFilter: OverloadFilter defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[ValueParameterDescriptorImpl]

'filterPackageMemberOverloads' @ [166:31] ==> public abstract fun filterPackageMemberOverloads(overloads: Collection<DeclarationDescriptorNonRoot>): Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadFilter[SimpleFunctionDescriptorImpl]

'possibleOverloads' @ [166:60] ==> val possibleOverloads: List<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getModulePackageMembersWithSameName[LocalVariableDescriptor]

'create' @ [173:40] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(): MultiMap<(Name..Name?), (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Name
    <V : (Any..Any?)> -> CallableMemberDescriptor

'classDescriptor' @ [175:26] ==> value-parameter classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[ValueParameterDescriptorImpl]

'declaredCallableMembers' @ [175:42] ==> public final val ClassDescriptorWithResolutionScopes.declaredCallableMembers: Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>[MyPropertyDescriptor]

'functionsByName' @ [176:13] ==> val functionsByName: MultiMap<(Name..Name?), (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[LocalVariableDescriptor]

'putValue' @ [176:29] ==> public open fun putValue(@Nullable p0: Name?, p1: (CallableMemberDescriptor..CallableMemberDescriptor?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'function' @ [176:38] ==> val function: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[LocalVariableDescriptor]

'name' @ [176:47] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'function' @ [176:53] ==> val function: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[LocalVariableDescriptor]

'nestedClassConstructors' @ [179:35] ==> value-parameter nestedClassConstructors: Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[ValueParameterDescriptorImpl]

'nestedConstructor' @ [180:24] ==> val nestedConstructor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[LocalVariableDescriptor]

'containingDeclaration' @ [180:42] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'name' @ [180:64] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'functionsByName' @ [181:13] ==> val functionsByName: MultiMap<(Name..Name?), (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[LocalVariableDescriptor]

'putValue' @ [181:29] ==> public open fun putValue(@Nullable p0: Name?, p1: (CallableMemberDescriptor..CallableMemberDescriptor?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'name' @ [181:38] ==> val name: Name defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[LocalVariableDescriptor]

'nestedConstructor' @ [181:44] ==> val nestedConstructor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[LocalVariableDescriptor]

'functionsByName' @ [184:19] ==> val functionsByName: MultiMap<(Name..Name?), (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[LocalVariableDescriptor]

'entrySet' @ [184:35] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(Name..Name?), (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>..Map.Entry<(Name..Name?), (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>?)>..Set<(MutableMap.MutableEntry<(Name..Name?), (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>..Map.Entry<(Name..Name?), (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'checkOverloadsInClass' @ [185:13] ==> private final fun checkOverloadsInClass(members: Collection<CallableMemberDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'e' @ [185:35] ==> val e: (MutableMap.MutableEntry<(Name..Name?), (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>..Map.Entry<(Name..Name?), (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[LocalVariableDescriptor]

'value' @ [185:37] ==> public abstract val value: (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'members' @ [190:13] ==> value-parameter members: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[ValueParameterDescriptorImpl]

'size' @ [190:21] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'LinkedHashMap' @ [192:33] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> DeclarationDescriptorNonRoot
    <V : (Any..Any?)> -> MutableSet<DeclarationDescriptorNonRoot>

'getPossibleRedeclarationGroups' @ [193:36] ==> private final fun getPossibleRedeclarationGroups(members: Collection<DeclarationDescriptorNonRoot>): Collection<Collection<DeclarationDescriptorNonRoot>> defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'members' @ [193:67] ==> value-parameter members: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[ValueParameterDescriptorImpl]

'findRedeclarations' @ [194:34] ==> private final fun findRedeclarations(members: Collection<DeclarationDescriptorNonRoot>): Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'redeclarationGroup' @ [194:53] ==> val redeclarationGroup: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'redeclarations' @ [195:13] ==> val redeclarations: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'forEach' @ [195:28] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptorNonRoot>.forEach(action: (DeclarationDescriptorNonRoot) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptorNonRoot

'redeclarationsMap' @ [196:17] ==> val redeclarationsMap: LinkedHashMap<DeclarationDescriptorNonRoot, MutableSet<DeclarationDescriptorNonRoot>> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'getOrPut' @ [196:35] ==> public inline fun <K, V> MutableMap<DeclarationDescriptorNonRoot, MutableSet<DeclarationDescriptorNonRoot>>.getOrPut(key: DeclarationDescriptorNonRoot, defaultValue: () -> MutableSet<DeclarationDescriptorNonRoot>): MutableSet<DeclarationDescriptorNonRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptorNonRoot
    <V> -> MutableSet<DeclarationDescriptorNonRoot>

'it' @ [196:44] ==> value-parameter it: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage.<anonymous>[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [196:50] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptorNonRoot

'addAll' @ [196:68] ==> public abstract fun addAll(elements: Collection<DeclarationDescriptorNonRoot>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'redeclarations' @ [196:75] ==> val redeclarations: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'HashSet' @ [200:24] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptorNonRoot

'component1' @ [201:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<DeclarationDescriptorNonRoot, MutableSet<DeclarationDescriptorNonRoot>>.component1(): DeclarationDescriptorNonRoot defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptorNonRoot
    <V> -> MutableSet<DeclarationDescriptorNonRoot>

'component2' @ [201:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<DeclarationDescriptorNonRoot, MutableSet<DeclarationDescriptorNonRoot>>.component2(): MutableSet<DeclarationDescriptorNonRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptorNonRoot
    <V> -> MutableSet<DeclarationDescriptorNonRoot>

'redeclarationsMap' @ [201:39] ==> val redeclarationsMap: LinkedHashMap<DeclarationDescriptorNonRoot, MutableSet<DeclarationDescriptorNonRoot>> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'!' @ [202:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'reported' @ [202:18] ==> val reported: HashSet<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'contains' @ [202:27] ==> public open fun contains(element: DeclarationDescriptorNonRoot): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'member' @ [202:36] ==> val member: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'reported' @ [203:17] ==> val reported: HashSet<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'addAll' @ [203:26] ==> public open fun addAll(elements: Collection<DeclarationDescriptorNonRoot>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'conflicting' @ [203:33] ==> val conflicting: MutableSet<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'reportRedeclarations' @ [204:17] ==> private final fun reportRedeclarations(redeclarations: Collection<DeclarationDescriptorNonRoot>): Unit defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'conflicting' @ [204:38] ==> val conflicting: MutableSet<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInPackage[LocalVariableDescriptor]

'arrayListOf' @ [210:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Collection<DeclarationDescriptorNonRoot>> /* = ArrayList<Collection<DeclarationDescriptorNonRoot>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<DeclarationDescriptorNonRoot>

'members' @ [212:27] ==> value-parameter members: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[ValueParameterDescriptorImpl]

'filter' @ [212:35] ==> public inline fun <T> Iterable<DeclarationDescriptorNonRoot>.filter(predicate: (DeclarationDescriptorNonRoot) -> Boolean): List<DeclarationDescriptorNonRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptorNonRoot

'!' @ [212:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [212:45] ==> value-parameter it: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups.<anonymous>[ValueParameterDescriptorImpl]

'isPrivate' @ [212:48] ==> private final fun DeclarationDescriptor.isPrivate(): Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'members' @ [214:28] ==> value-parameter members: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[ValueParameterDescriptorImpl]

'groupBy' @ [214:36] ==> public inline fun <T, K> Iterable<DeclarationDescriptorNonRoot>.groupBy(keySelector: (DeclarationDescriptorNonRoot) -> SourceFile): Map<SourceFile, List<DeclarationDescriptorNonRoot>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptorNonRoot
    <K> -> SourceFile

'getContainingSourceFile' @ [214:62] ==> @NotNull public open fun getContainingSourceFile(@NotNull p0: DeclarationDescriptor): SourceFile defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [214:86] ==> value-parameter it: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups.<anonymous>[ValueParameterDescriptorImpl]

'bySourceFile' @ [217:31] ==> val bySourceFile: Map<SourceFile, List<DeclarationDescriptorNonRoot>> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'values' @ [217:44] ==> public abstract val values: Collection<List<DeclarationDescriptorNonRoot>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'membersInFile' @ [219:17] ==> val membersInFile: List<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'any' @ [219:31] ==> public inline fun <T> Iterable<DeclarationDescriptorNonRoot>.any(predicate: (DeclarationDescriptorNonRoot) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptorNonRoot

'it' @ [219:37] ==> value-parameter it: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups.<anonymous>[ValueParameterDescriptorImpl]

'isPrivate' @ [219:40] ==> private final fun DeclarationDescriptor.isPrivate(): Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'hasGroupIncludingNonPrivateMembers' @ [220:17] ==> var hasGroupIncludingNonPrivateMembers: Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'LinkedHashSet' @ [221:29] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>..Collection<(DeclarationDescriptorNonRoot..DeclarationDescriptorNonRoot?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptorNonRoot

'nonPrivates' @ [221:73] ==> val nonPrivates: List<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'membersInFile' @ [221:88] ==> val membersInFile: List<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'result' @ [222:17] ==> val result: ArrayList<Collection<DeclarationDescriptorNonRoot>> /* = ArrayList<Collection<DeclarationDescriptorNonRoot>> */ defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'add' @ [222:24] ==> public open fun add(element: Collection<DeclarationDescriptorNonRoot>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'group' @ [222:28] ==> val group: Set<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'!' @ [226:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasGroupIncludingNonPrivateMembers' @ [226:14] ==> var hasGroupIncludingNonPrivateMembers: Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'nonPrivates' @ [226:52] ==> val nonPrivates: List<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'size' @ [226:64] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'result' @ [227:13] ==> val result: ArrayList<Collection<DeclarationDescriptorNonRoot>> /* = ArrayList<Collection<DeclarationDescriptorNonRoot>> */ defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'add' @ [227:20] ==> public open fun add(element: Collection<DeclarationDescriptorNonRoot>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'nonPrivates' @ [227:24] ==> val nonPrivates: List<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'result' @ [230:16] ==> val result: ArrayList<Collection<DeclarationDescriptorNonRoot>> /* = ArrayList<Collection<DeclarationDescriptorNonRoot>> */ defined in org.jetbrains.kotlin.resolve.OverloadResolver.getPossibleRedeclarationGroups[LocalVariableDescriptor]

'this' @ [234:13] ==> <this> defined in org.jetbrains.kotlin.resolve.OverloadResolver.isPrivate[ReceiverParameterDescriptorImpl]

'isPrivate' @ [235:26] ==> public open fun isPrivate(@NotNull p0: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'this' @ [235:36] ==> <this> defined in org.jetbrains.kotlin.resolve.OverloadResolver.isPrivate[ReceiverParameterDescriptorImpl]

'visibility' @ [235:41] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'members' @ [238:13] ==> value-parameter members: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[ValueParameterDescriptorImpl]

'size' @ [238:21] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'reportRedeclarations' @ [239:9] ==> private final fun reportRedeclarations(redeclarations: Collection<DeclarationDescriptorNonRoot>): Unit defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'findRedeclarations' @ [239:30] ==> private final fun findRedeclarations(members: Collection<DeclarationDescriptorNonRoot>): Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'members' @ [239:49] ==> value-parameter members: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.OverloadResolver.checkOverloadsInClass[ValueParameterDescriptorImpl]

'this' @ [243:13] ==> <this> defined in org.jetbrains.kotlin.resolve.OverloadResolver.isSynthesized[ReceiverParameterDescriptorImpl]

'kind' @ [243:49] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'SYNTHESIZED' @ [243:87] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'linkedSetOf' @ [246:30] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<DeclarationDescriptorNonRoot> /* = LinkedHashSet<DeclarationDescriptorNonRoot> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptorNonRoot

'members' @ [247:25] ==> value-parameter members: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[ValueParameterDescriptorImpl]

'member1' @ [248:17] ==> val member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'isSynthesized' @ [248:25] ==> private final fun DeclarationDescriptor.isSynthesized(): Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'members' @ [250:29] ==> value-parameter members: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[ValueParameterDescriptorImpl]

'member1' @ [251:21] ==> val member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'member2' @ [251:32] ==> val member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'isConstructorsOfDifferentRedeclaredClasses' @ [252:21] ==> private final fun isConstructorsOfDifferentRedeclaredClasses(member1: DeclarationDescriptor, member2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'member1' @ [252:64] ==> val member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'member2' @ [252:73] ==> val member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'isTopLevelMainInDifferentFiles' @ [253:21] ==> private final fun isTopLevelMainInDifferentFiles(member1: DeclarationDescriptor, member2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'member1' @ [253:52] ==> val member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'member2' @ [253:61] ==> val member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'isDefinitionsForDifferentPlatforms' @ [254:21] ==> private final fun isDefinitionsForDifferentPlatforms(member1: DeclarationDescriptorNonRoot, member2: DeclarationDescriptorNonRoot): Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'member1' @ [254:56] ==> val member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'member2' @ [254:65] ==> val member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'isHeaderDeclarationAndDefinition' @ [255:21] ==> private final fun isHeaderDeclarationAndDefinition(declaration: DeclarationDescriptor, definition: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'member1' @ [255:54] ==> val member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'member2' @ [255:63] ==> val member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'isHeaderDeclarationAndDefinition' @ [255:75] ==> private final fun isHeaderDeclarationAndDefinition(declaration: DeclarationDescriptor, definition: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'member2' @ [255:108] ==> val member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'member1' @ [255:117] ==> val member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'!' @ [257:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overloadChecker' @ [257:22] ==> private final val overloadChecker: OverloadChecker defined in org.jetbrains.kotlin.resolve.OverloadResolver[PropertyDescriptorImpl]

'isOverloadable' @ [257:38] ==> public final fun isOverloadable(a: DeclarationDescriptor, b: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverloadChecker[SimpleFunctionDescriptorImpl]

'member1' @ [257:53] ==> val member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'member2' @ [257:62] ==> val member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'redeclarations' @ [258:21] ==> val redeclarations: LinkedHashSet<DeclarationDescriptorNonRoot> /* = LinkedHashSet<DeclarationDescriptorNonRoot> */ defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'add' @ [258:36] ==> public open fun add(element: DeclarationDescriptorNonRoot): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'member1' @ [258:40] ==> val member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'redeclarations' @ [262:16] ==> val redeclarations: LinkedHashSet<DeclarationDescriptorNonRoot> /* = LinkedHashSet<DeclarationDescriptorNonRoot> */ defined in org.jetbrains.kotlin.resolve.OverloadResolver.findRedeclarations[LocalVariableDescriptor]

'member1' @ [266:13] ==> value-parameter member1: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isConstructorsOfDifferentRedeclaredClasses[ValueParameterDescriptorImpl]

'member2' @ [266:50] ==> value-parameter member2: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isConstructorsOfDifferentRedeclaredClasses[ValueParameterDescriptorImpl]

'member1' @ [270:23] ==> value-parameter member1: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isConstructorsOfDifferentRedeclaredClasses[ValueParameterDescriptorImpl]

'containingDeclaration' @ [270:31] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'member2' @ [271:23] ==> value-parameter member2: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isConstructorsOfDifferentRedeclaredClasses[ValueParameterDescriptorImpl]

'containingDeclaration' @ [271:31] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'parent1' @ [272:16] ==> val parent1: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.OverloadResolver.isConstructorsOfDifferentRedeclaredClasses[LocalVariableDescriptor]

'parent2' @ [272:28] ==> val parent2: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.OverloadResolver.isConstructorsOfDifferentRedeclaredClasses[LocalVariableDescriptor]

'parent1' @ [272:39] ==> val parent1: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.OverloadResolver.isConstructorsOfDifferentRedeclaredClasses[LocalVariableDescriptor]

'containingDeclaration' @ [272:47] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'parent2' @ [272:72] ==> val parent2: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.OverloadResolver.isConstructorsOfDifferentRedeclaredClasses[LocalVariableDescriptor]

'containingDeclaration' @ [272:80] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [276:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'MainFunctionDetector' @ [276:14] ==> public companion object defined in org.jetbrains.kotlin.idea.MainFunctionDetector[FakeCallableDescriptorForObject]

'isMain' @ [276:35] ==> public final fun isMain(descriptor: DeclarationDescriptor, checkJvmStaticAnnotation: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.MainFunctionDetector.Companion[SimpleFunctionDescriptorImpl]

'member1' @ [276:42] ==> value-parameter member1: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isTopLevelMainInDifferentFiles[ValueParameterDescriptorImpl]

'!' @ [276:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'MainFunctionDetector' @ [276:55] ==> public companion object defined in org.jetbrains.kotlin.idea.MainFunctionDetector[FakeCallableDescriptorForObject]

'isMain' @ [276:76] ==> public final fun isMain(descriptor: DeclarationDescriptor, checkJvmStaticAnnotation: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.MainFunctionDetector.Companion[SimpleFunctionDescriptorImpl]

'member2' @ [276:83] ==> value-parameter member2: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isTopLevelMainInDifferentFiles[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [280:21] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'getContainingFile' @ [280:45] ==> @JvmStatic public final fun getContainingFile(declarationDescriptor: DeclarationDescriptor): KtFile? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'member1' @ [280:63] ==> value-parameter member1: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isTopLevelMainInDifferentFiles[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [281:21] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'getContainingFile' @ [281:45] ==> @JvmStatic public final fun getContainingFile(declarationDescriptor: DeclarationDescriptor): KtFile? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'member2' @ [281:63] ==> value-parameter member2: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isTopLevelMainInDifferentFiles[ValueParameterDescriptorImpl]

'file1' @ [282:16] ==> val file1: KtFile? defined in org.jetbrains.kotlin.resolve.OverloadResolver.isTopLevelMainInDifferentFiles[LocalVariableDescriptor]

'file2' @ [282:33] ==> val file2: KtFile? defined in org.jetbrains.kotlin.resolve.OverloadResolver.isTopLevelMainInDifferentFiles[LocalVariableDescriptor]

'file1' @ [282:50] ==> val file1: KtFile? defined in org.jetbrains.kotlin.resolve.OverloadResolver.isTopLevelMainInDifferentFiles[LocalVariableDescriptor]

'file2' @ [282:60] ==> val file2: KtFile? defined in org.jetbrains.kotlin.resolve.OverloadResolver.isTopLevelMainInDifferentFiles[LocalVariableDescriptor]

'declaration' @ [286:16] ==> value-parameter declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isHeaderDeclarationAndDefinition[ValueParameterDescriptorImpl]

'declaration' @ [286:51] ==> value-parameter declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isHeaderDeclarationAndDefinition[ValueParameterDescriptorImpl]

'isHeader' @ [286:63] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'definition' @ [287:16] ==> value-parameter definition: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isHeaderDeclarationAndDefinition[ValueParameterDescriptorImpl]

'!' @ [287:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'definition' @ [287:51] ==> value-parameter definition: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.OverloadResolver.isHeaderDeclarationAndDefinition[ValueParameterDescriptorImpl]

'isHeader' @ [287:62] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'member1' @ [291:13] ==> value-parameter member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.isDefinitionsForDifferentPlatforms[ValueParameterDescriptorImpl]

'member2' @ [291:45] ==> value-parameter member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.isDefinitionsForDifferentPlatforms[ValueParameterDescriptorImpl]

'member1' @ [293:16] ==> value-parameter member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.isDefinitionsForDifferentPlatforms[ValueParameterDescriptorImpl]

'isImpl' @ [293:24] ==> public final val MemberDescriptor.isImpl: Boolean[MyPropertyDescriptor]

'member2' @ [293:34] ==> value-parameter member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.isDefinitionsForDifferentPlatforms[ValueParameterDescriptorImpl]

'isImpl' @ [293:42] ==> public final val MemberDescriptor.isImpl: Boolean[MyPropertyDescriptor]

'member1' @ [294:16] ==> value-parameter member1: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.isDefinitionsForDifferentPlatforms[ValueParameterDescriptorImpl]

'getMultiTargetPlatform' @ [294:24] ==> public fun MemberDescriptor.getMultiTargetPlatform(): String? defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'member2' @ [294:52] ==> value-parameter member2: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.isDefinitionsForDifferentPlatforms[ValueParameterDescriptorImpl]

'getMultiTargetPlatform' @ [294:60] ==> public fun MemberDescriptor.getMultiTargetPlatform(): String? defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'redeclarations' @ [298:13] ==> value-parameter redeclarations: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.reportRedeclarations[ValueParameterDescriptorImpl]

'isEmpty' @ [298:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'redeclarations' @ [300:34] ==> value-parameter redeclarations: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.reportRedeclarations[ValueParameterDescriptorImpl]

'when (memberDescriptor) {
                is PropertyDescriptor,
                is ClassifierDescriptor ->
                    reportOnDeclaration(trace, memberDescriptor) { Errors.REDECLARATION.on(it, redeclarations) }
                is FunctionDescriptor ->
                    reportOnDeclaration(trace, memberDescriptor) { Errors.CONFLICTING_OVERLOADS.on(it, redeclarations) }
            }' @ [301:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'memberDescriptor' @ [301:19] ==> val memberDescriptor: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.reportRedeclarations[LocalVariableDescriptor]

'reportOnDeclaration' @ [304:21] ==> public inline fun reportOnDeclaration(trace: BindingTrace, descriptor: DeclarationDescriptor, what: (PsiElement) -> Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics in file diagnosticUtils.kt[SimpleFunctionDescriptorImpl]

'trace' @ [304:41] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverloadResolver[PropertyDescriptorImpl]

'memberDescriptor' @ [304:48] ==> val memberDescriptor: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.reportRedeclarations[LocalVariableDescriptor]

'REDECLARATION' @ [304:75] ==> public final val REDECLARATION: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [304:89] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [304:92] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.OverloadResolver.reportRedeclarations.<anonymous>[ValueParameterDescriptorImpl]

'redeclarations' @ [304:96] ==> value-parameter redeclarations: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.reportRedeclarations[ValueParameterDescriptorImpl]

'reportOnDeclaration' @ [306:21] ==> public inline fun reportOnDeclaration(trace: BindingTrace, descriptor: DeclarationDescriptor, what: (PsiElement) -> Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics in file diagnosticUtils.kt[SimpleFunctionDescriptorImpl]

'trace' @ [306:41] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.OverloadResolver[PropertyDescriptorImpl]

'memberDescriptor' @ [306:48] ==> val memberDescriptor: DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.resolve.OverloadResolver.reportRedeclarations[LocalVariableDescriptor]

'CONFLICTING_OVERLOADS' @ [306:75] ==> public final val CONFLICTING_OVERLOADS: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [306:97] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [306:100] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.OverloadResolver.reportRedeclarations.<anonymous>[ValueParameterDescriptorImpl]

'redeclarations' @ [306:104] ==> value-parameter redeclarations: Collection<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.resolve.OverloadResolver.reportRedeclarations[ValueParameterDescriptorImpl]

