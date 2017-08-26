'MemberScopeImpl' @ [45:5] ==> public constructor MemberScopeImpl() defined in org.jetbrains.kotlin.resolve.scopes.MemberScopeImpl[DeserializedClassConstructorDescriptor]

'c' @ [47:52] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'storageManager' @ [47:54] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'storageManager' @ [48:92] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'createMemoizedFunction' @ [48:107] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (Name) -> List<ClassDescriptor>): MemoizedFunctionToNotNull<Name, List<ClassDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V : Any> -> List<ClassDescriptor>

'doGetClasses' @ [48:132] ==> private final fun doGetClasses(name: Name): List<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [48:145] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.classDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'storageManager' @ [49:110] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'createMemoizedFunction' @ [49:125] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (Name) -> Collection<SimpleFunctionDescriptor>): MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V : Any> -> Collection<SimpleFunctionDescriptor>

'doGetFunctions' @ [49:150] ==> private final fun doGetFunctions(name: Name): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [49:165] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.functionDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'storageManager' @ [50:104] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'createMemoizedFunction' @ [50:119] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (Name) -> Collection<PropertyDescriptor>): MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V : Any> -> Collection<PropertyDescriptor>

'doGetProperties' @ [50:144] ==> private final fun doGetProperties(name: Name): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [50:160] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.propertyDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'storageManager' @ [51:106] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'createMemoizedFunction' @ [51:121] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (Name) -> Collection<TypeAliasDescriptor>): MemoizedFunctionToNotNull<Name, Collection<TypeAliasDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V : Any> -> Collection<TypeAliasDescriptor>

'doGetTypeAliases' @ [51:146] ==> private final fun doGetTypeAliases(name: Name): Collection<TypeAliasDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [51:163] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.typeAliasDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'newLinkedHashSet' @ [54:27] ==> public open fun <E : (Any..Any?)> newLinkedHashSet(): (LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>..LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ClassDescriptor

'declarationProvider' @ [55:9] ==> protected final val declarationProvider: DP defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getClassOrObjectDeclarations' @ [55:29] ==> public abstract fun getClassOrObjectDeclarations(name: Name): Collection<KtClassLikeInfo> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [55:58] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses[ValueParameterDescriptorImpl]

'mapTo' @ [55:64] ==> public inline fun <T, R, C : MutableCollection<in LazyClassDescriptor>> Iterable<KtClassLikeInfo>.mapTo(destination: (LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>..LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>?), transform: (KtClassLikeInfo) -> LazyClassDescriptor): (LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>..LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassLikeInfo
    <R> -> LazyClassDescriptor
    <C : MutableCollection<in R>> -> (java.util.LinkedHashSet<(org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)>..java.util.LinkedHashSet<(org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)>?)

'result' @ [55:70] ==> val result: (LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>..LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses[LocalVariableDescriptor]

'if (it is KtScriptInfo)
                LazyScriptDescriptor(c as ResolveSession, thisDescriptor, name, it)
            else {
                val isExternal = it.modifierList?.hasModifier(KtTokens.EXTERNAL_KEYWORD) ?: false
                LazyClassDescriptor(c, thisDescriptor, name, it, isExternal)
            }' @ [56:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LazyClassDescriptor, elseBranch: LazyClassDescriptor): LazyClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LazyClassDescriptor

'it' @ [56:17] ==> value-parameter it: KtClassLikeInfo defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'LazyScriptDescriptor' @ [57:17] ==> public constructor LazyScriptDescriptor(resolveSession: ResolveSession, containingDeclaration: DeclarationDescriptor, name: Name, scriptInfo: KtScriptInfo) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyScriptDescriptor[ClassConstructorDescriptorImpl]

'c' @ [57:38] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'thisDescriptor' @ [57:59] ==> protected final val thisDescriptor: D defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'name' @ [57:75] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses[ValueParameterDescriptorImpl]

'it' @ [57:81] ==> value-parameter it: KtClassLikeInfo defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [59:34] ==> value-parameter it: KtClassLikeInfo defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'modifierList' @ [59:37] ==> public final val KtClassLikeInfo.modifierList: KtModifierList?[MyPropertyDescriptor]

'hasModifier' @ [59:51] ==> public open fun hasModifier(@NotNull tokenType: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [59:72] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LazyClassDescriptor' @ [60:17] ==> public constructor LazyClassDescriptor(@NotNull c: LazyClassContext, @NotNull containingDeclaration: DeclarationDescriptor, @NotNull name: Name, @NotNull classLikeInfo: KtClassLikeInfo, isExternal: Boolean) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassDescriptor[JavaClassConstructorDescriptor]

'c' @ [60:37] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'thisDescriptor' @ [60:40] ==> protected final val thisDescriptor: D defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'name' @ [60:56] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses[ValueParameterDescriptorImpl]

'it' @ [60:62] ==> value-parameter it: KtClassLikeInfo defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'isExternal' @ [60:66] ==> val isExternal: Boolean defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses.<anonymous>[LocalVariableDescriptor]

'getNonDeclaredClasses' @ [63:9] ==> protected abstract fun getNonDeclaredClasses(name: Name, result: MutableSet<ClassDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [63:31] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses[ValueParameterDescriptorImpl]

'result' @ [63:37] ==> val result: (LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>..LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses[LocalVariableDescriptor]

'result' @ [64:16] ==> val result: (LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>..LinkedHashSet<(ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetClasses[LocalVariableDescriptor]

'toList' @ [64:23] ==> public fun <T> Iterable<(ClassDescriptor..ClassDescriptor?)>.toList(): List<(ClassDescriptor..ClassDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'recordLookup' @ [68:9] ==> public abstract fun recordLookup(name: Name, from: LookupLocation): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [68:22] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [68:28] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'invoke' @ [70:23] ==> public abstract fun invoke(p1: Name): List<ClassDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [70:40] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'invoke' @ [71:27] ==> public abstract fun invoke(p1: Name): Collection<TypeAliasDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [71:48] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'classes' @ [74:23] ==> val classes: List<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'!' @ [75:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'klass' @ [75:18] ==> val klass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'isHeader' @ [75:24] ==> public final val ClassDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'klass' @ [75:41] ==> val klass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'result' @ [76:17] ==> var result: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'result' @ [76:33] ==> var result: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'klass' @ [76:42] ==> val klass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'typeAliases' @ [78:27] ==> val typeAliases: Collection<TypeAliasDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'!' @ [79:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeAlias' @ [79:18] ==> val typeAlias: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'isHeader' @ [79:28] ==> public final val TypeAliasDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'typeAlias' @ [79:45] ==> val typeAlias: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'result' @ [80:17] ==> var result: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'result' @ [80:33] ==> var result: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'typeAlias' @ [80:42] ==> val typeAlias: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'result' @ [82:16] ==> var result: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedClassifier[LocalVariableDescriptor]

'recordLookup' @ [86:9] ==> public abstract fun recordLookup(name: Name, from: LookupLocation): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [86:22] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [86:28] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'invoke' @ [87:16] ==> public abstract fun invoke(p1: Name): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [87:36] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'newLinkedHashSet' @ [91:27] ==> public open fun <E : (Any..Any?)> newLinkedHashSet(): (LinkedHashSet<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..LinkedHashSet<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SimpleFunctionDescriptor

'declarationProvider' @ [93:28] ==> protected final val declarationProvider: DP defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getFunctionDeclarations' @ [93:48] ==> public abstract fun getFunctionDeclarations(name: Name): Collection<KtNamedFunction> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [93:72] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions[ValueParameterDescriptorImpl]

'declarations' @ [94:37] ==> val declarations: Collection<KtNamedFunction> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions[LocalVariableDescriptor]

'result' @ [95:13] ==> val result: (LinkedHashSet<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..LinkedHashSet<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions[LocalVariableDescriptor]

'add' @ [95:20] ==> public open fun add(element: (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'c' @ [95:24] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'functionDescriptorResolver' @ [95:26] ==> public abstract val functionDescriptorResolver: FunctionDescriptorResolver defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'resolveFunctionDescriptor' @ [95:53] ==> public final fun resolveFunctionDescriptor(containingDescriptor: DeclarationDescriptor, scope: LexicalScope, function: KtNamedFunction, trace: BindingTrace, dataFlowInfo: DataFlowInfo): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.FunctionDescriptorResolver[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [96:21] ==> protected final val thisDescriptor: D defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getScopeForMemberDeclarationResolution' @ [97:21] ==> protected abstract fun getScopeForMemberDeclarationResolution(declaration: KtDeclaration): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'functionDeclaration' @ [97:60] ==> val functionDeclaration: KtNamedFunction defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions[LocalVariableDescriptor]

'functionDeclaration' @ [98:21] ==> val functionDeclaration: KtNamedFunction defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions[LocalVariableDescriptor]

'trace' @ [99:21] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'c' @ [100:21] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'declarationScopeProvider' @ [100:23] ==> public abstract val declarationScopeProvider: DeclarationScopeProvider defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'getOuterDataFlowInfoForDeclaration' @ [100:48] ==> @NotNull public abstract fun getOuterDataFlowInfoForDeclaration(@NotNull elementOfDeclaration: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.lazy.DeclarationScopeProvider[JavaMethodDescriptor]

'functionDeclaration' @ [100:83] ==> val functionDeclaration: KtNamedFunction defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions[LocalVariableDescriptor]

'getNonDeclaredFunctions' @ [103:9] ==> protected abstract fun getNonDeclaredFunctions(name: Name, result: MutableSet<SimpleFunctionDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [103:33] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions[ValueParameterDescriptorImpl]

'result' @ [103:39] ==> val result: (LinkedHashSet<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..LinkedHashSet<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions[LocalVariableDescriptor]

'result' @ [105:16] ==> val result: (LinkedHashSet<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..LinkedHashSet<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions[LocalVariableDescriptor]

'toList' @ [105:23] ==> public fun <T> Iterable<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>.toList(): List<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'recordLookup' @ [117:9] ==> public abstract fun recordLookup(name: Name, from: LookupLocation): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [117:22] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [117:28] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'invoke' @ [118:16] ==> public abstract fun invoke(p1: Name): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [118:36] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [122:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PropertyDescriptor

'declarationProvider' @ [124:28] ==> protected final val declarationProvider: DP defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getPropertyDeclarations' @ [124:48] ==> public abstract fun getPropertyDeclarations(name: Name): Collection<KtProperty> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [124:72] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[ValueParameterDescriptorImpl]

'declarations' @ [125:37] ==> val declarations: Collection<KtProperty> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'c' @ [126:38] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'descriptorResolver' @ [126:40] ==> public abstract val descriptorResolver: DescriptorResolver defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'resolvePropertyDescriptor' @ [126:59] ==> @NotNull public open fun resolvePropertyDescriptor(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull scopeForDeclarationResolution: LexicalScope, @NotNull scopeForInitializerResolution: LexicalScope, @NotNull property: KtProperty, @NotNull trace: BindingTrace, @NotNull dataFlowInfo: DataFlowInfo): PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'thisDescriptor' @ [127:21] ==> protected final val thisDescriptor: D defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getScopeForMemberDeclarationResolution' @ [128:21] ==> protected abstract fun getScopeForMemberDeclarationResolution(declaration: KtDeclaration): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'propertyDeclaration' @ [128:60] ==> val propertyDeclaration: KtProperty defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'getScopeForInitializerResolution' @ [129:21] ==> protected abstract fun getScopeForInitializerResolution(declaration: KtDeclaration): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'propertyDeclaration' @ [129:54] ==> val propertyDeclaration: KtProperty defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'propertyDeclaration' @ [130:21] ==> val propertyDeclaration: KtProperty defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'trace' @ [131:21] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'c' @ [132:21] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'declarationScopeProvider' @ [132:23] ==> public abstract val declarationScopeProvider: DeclarationScopeProvider defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'getOuterDataFlowInfoForDeclaration' @ [132:48] ==> @NotNull public abstract fun getOuterDataFlowInfoForDeclaration(@NotNull elementOfDeclaration: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.lazy.DeclarationScopeProvider[JavaMethodDescriptor]

'propertyDeclaration' @ [132:83] ==> val propertyDeclaration: KtProperty defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'result' @ [133:13] ==> val result: LinkedHashSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'add' @ [133:20] ==> public open fun add(element: PropertyDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'propertyDescriptor' @ [133:24] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'declarationProvider' @ [136:23] ==> protected final val declarationProvider: DP defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getDestructuringDeclarationsEntries' @ [136:43] ==> public abstract fun getDestructuringDeclarationsEntries(name: Name): Collection<KtDestructuringDeclarationEntry> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [136:79] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[ValueParameterDescriptorImpl]

'c' @ [137:38] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'descriptorResolver' @ [137:40] ==> public abstract val descriptorResolver: DescriptorResolver defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'resolveDestructuringDeclarationEntryAsProperty' @ [137:59] ==> @NotNull public open fun resolveDestructuringDeclarationEntryAsProperty(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull scopeForDeclarationResolution: LexicalScope, @NotNull scopeForInitializerResolution: LexicalScope, @NotNull entry: KtDestructuringDeclarationEntry, @NotNull trace: BindingTrace, @NotNull dataFlowInfo: DataFlowInfo): PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'thisDescriptor' @ [138:21] ==> protected final val thisDescriptor: D defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getScopeForMemberDeclarationResolution' @ [139:21] ==> protected abstract fun getScopeForMemberDeclarationResolution(declaration: KtDeclaration): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'entry' @ [139:60] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'getScopeForInitializerResolution' @ [140:21] ==> protected abstract fun getScopeForInitializerResolution(declaration: KtDeclaration): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'entry' @ [140:54] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'entry' @ [141:21] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'trace' @ [142:21] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'c' @ [143:21] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'declarationScopeProvider' @ [143:23] ==> public abstract val declarationScopeProvider: DeclarationScopeProvider defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'getOuterDataFlowInfoForDeclaration' @ [143:48] ==> @NotNull public abstract fun getOuterDataFlowInfoForDeclaration(@NotNull elementOfDeclaration: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.lazy.DeclarationScopeProvider[JavaMethodDescriptor]

'entry' @ [143:83] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'result' @ [144:13] ==> val result: LinkedHashSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'add' @ [144:20] ==> public open fun add(element: PropertyDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'propertyDescriptor' @ [144:24] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'getNonDeclaredProperties' @ [147:9] ==> protected abstract fun getNonDeclaredProperties(name: Name, result: MutableSet<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [147:34] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[ValueParameterDescriptorImpl]

'result' @ [147:40] ==> val result: LinkedHashSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'result' @ [149:16] ==> val result: LinkedHashSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties[LocalVariableDescriptor]

'toList' @ [149:23] ==> public fun <T> Iterable<PropertyDescriptor>.toList(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'recordLookup' @ [155:9] ==> public abstract fun recordLookup(name: Name, from: LookupLocation): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [155:22] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedTypeAliasDescriptors[ValueParameterDescriptorImpl]

'location' @ [155:28] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedTypeAliasDescriptors[ValueParameterDescriptorImpl]

'invoke' @ [156:16] ==> public abstract fun invoke(p1: Name): Collection<TypeAliasDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [156:37] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedTypeAliasDescriptors[ValueParameterDescriptorImpl]

'declarationProvider' @ [160:13] ==> protected final val declarationProvider: DP defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getTypeAliasDeclarations' @ [160:33] ==> public abstract fun getTypeAliasDeclarations(name: Name): Collection<KtTypeAlias> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProvider[SimpleFunctionDescriptorImpl]

'name' @ [160:58] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetTypeAliases[ValueParameterDescriptorImpl]

'map' @ [160:64] ==> public inline fun <T, R> Iterable<KtTypeAlias>.map(transform: (KtTypeAlias) -> TypeAliasDescriptor): List<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeAlias
    <R> -> TypeAliasDescriptor

'c' @ [161:17] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'descriptorResolver' @ [161:19] ==> public abstract val descriptorResolver: DescriptorResolver defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'resolveTypeAliasDescriptor' @ [161:38] ==> @NotNull public open fun resolveTypeAliasDescriptor(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull scope: LexicalScope, @NotNull typeAlias: KtTypeAlias, @NotNull trace: BindingTrace): TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'thisDescriptor' @ [162:25] ==> protected final val thisDescriptor: D defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getScopeForMemberDeclarationResolution' @ [163:25] ==> protected abstract fun getScopeForMemberDeclarationResolution(declaration: KtDeclaration): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'ktTypeAlias' @ [163:64] ==> value-parameter ktTypeAlias: KtTypeAlias defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetTypeAliases.<anonymous>[ValueParameterDescriptorImpl]

'ktTypeAlias' @ [164:25] ==> value-parameter ktTypeAlias: KtTypeAlias defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetTypeAliases.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [165:25] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'toList' @ [166:15] ==> public fun <T> Iterable<TypeAliasDescriptor>.toList(): List<TypeAliasDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor

'declarationProvider' @ [173:28] ==> protected final val declarationProvider: DP defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'getDeclarations' @ [173:48] ==> public abstract fun getDeclarations(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): List<KtDeclaration> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProvider[SimpleFunctionDescriptorImpl]

'kindFilter' @ [173:64] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[ValueParameterDescriptorImpl]

'nameFilter' @ [173:76] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [174:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: Int) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'declarations' @ [174:59] ==> val declarations: List<KtDeclaration> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'size' @ [174:72] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'declarations' @ [175:29] ==> val declarations: List<KtDeclaration> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'when (declaration) {
                is KtClassOrObject -> {
                    val name = declaration.nameAsSafeName
                    if (nameFilter(name)) {
                        result.addAll(classDescriptors(name))
                    }
                }
                is KtFunction -> {
                    val name = declaration.nameAsSafeName
                    if (nameFilter(name)) {
                        result.addAll(getContributedFunctions(name, location))
                    }
                }
                is KtProperty -> {
                    val name = declaration.nameAsSafeName
                    if (nameFilter(name)) {
                        result.addAll(getContributedVariables(name, location))
                    }
                }
                is KtParameter -> {
                    val name = declaration.nameAsSafeName
                    if (nameFilter(name)) {
                        result.addAll(getContributedVariables(name, location))
                    }
                }
                is KtTypeAlias -> {
                    val name = declaration.nameAsSafeName
                    if (nameFilter(name)) {
                        result.addAll(getContributedTypeAliasDescriptors(name, location))
                    }
                }
                is KtScript -> {
                    val name = declaration.nameAsSafeName
                    if (nameFilter(name)) {
                        result.addAll(classDescriptors(name))
                    }
                }
                is KtDestructuringDeclaration -> {
                    // MultiDeclarations are not supported on global level
                }
                else -> throw IllegalArgumentException("Unsupported declaration kind: " + declaration)
            }' @ [176:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit, entry6: Unit, entry7: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'declaration' @ [176:19] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'declaration' @ [178:32] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'nameAsSafeName' @ [178:44] ==> public final val KtClassOrObject.nameAsSafeName: Name[MyPropertyDescriptor]

'invoke' @ [179:25] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [179:36] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'result' @ [180:25] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'addAll' @ [180:32] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'invoke' @ [180:39] ==> public abstract fun invoke(p1: Name): List<ClassDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [180:56] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'declaration' @ [184:32] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'nameAsSafeName' @ [184:44] ==> public final val KtFunction.nameAsSafeName: Name[MyPropertyDescriptor]

'invoke' @ [185:25] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [185:36] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'result' @ [186:25] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'addAll' @ [186:32] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getContributedFunctions' @ [186:39] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [186:63] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'location' @ [186:69] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[ValueParameterDescriptorImpl]

'declaration' @ [190:32] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'nameAsSafeName' @ [190:44] ==> public final val KtProperty.nameAsSafeName: Name[MyPropertyDescriptor]

'invoke' @ [191:25] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [191:36] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'result' @ [192:25] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'addAll' @ [192:32] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getContributedVariables' @ [192:39] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [192:63] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'location' @ [192:69] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[ValueParameterDescriptorImpl]

'declaration' @ [196:32] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'nameAsSafeName' @ [196:44] ==> public final val KtParameter.nameAsSafeName: Name[MyPropertyDescriptor]

'invoke' @ [197:25] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [197:36] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'result' @ [198:25] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'addAll' @ [198:32] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getContributedVariables' @ [198:39] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [198:63] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'location' @ [198:69] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[ValueParameterDescriptorImpl]

'declaration' @ [202:32] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'nameAsSafeName' @ [202:44] ==> public final val KtTypeAlias.nameAsSafeName: Name[MyPropertyDescriptor]

'invoke' @ [203:25] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [203:36] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'result' @ [204:25] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'addAll' @ [204:32] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getContributedTypeAliasDescriptors' @ [204:39] ==> protected final fun getContributedTypeAliasDescriptors(name: Name, location: LookupLocation): Collection<TypeAliasDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [204:74] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'location' @ [204:80] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[ValueParameterDescriptorImpl]

'declaration' @ [208:32] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'nameAsSafeName' @ [208:44] ==> public final val KtScript.nameAsSafeName: Name[MyPropertyDescriptor]

'invoke' @ [209:25] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [209:36] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'result' @ [210:25] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'addAll' @ [210:32] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'invoke' @ [210:39] ==> public abstract fun invoke(p1: Name): List<ClassDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [210:56] ==> val name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'IllegalArgumentException' @ [216:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [216:56] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'declaration' @ [216:91] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'result' @ [219:16] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.computeDescriptorsFromDeclaredElements[LocalVariableDescriptor]

'toList' @ [219:23] ==> public fun <T> Iterable<DeclarationDescriptor>.toList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'?:' @ [229:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'declarationProvider' @ [229:31] ==> protected final val declarationProvider: DP defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'toInfoString' @ [229:93] ==> internal final fun toInfoString(): String defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider[SimpleFunctionDescriptorImpl]

'declarationProvider' @ [230:33] ==> protected final val declarationProvider: DP defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'toString' @ [230:53] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProvider[DeserializedSimpleFunctionDescriptor]

'p' @ [233:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [233:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [233:19] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[LazyClassReceiverParameterDescriptor]

'java' @ [233:31] ==> public val <T> KClass<out AbstractLazyMemberScope<D, DP>>.java: Class<out AbstractLazyMemberScope<D, DP>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractLazyMemberScope<D, DP>

'simpleName' @ [233:36] ==> public final val <T : (Any..Any?)> Class<out AbstractLazyMemberScope<D, DP>>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AbstractLazyMemberScope<D, DP>

'p' @ [234:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [234:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [236:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [236:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'thisDescriptor' @ [236:40] ==> protected final val thisDescriptor: D defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[PropertyDescriptorImpl]

'p' @ [238:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'popIndent' @ [238:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [239:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [239:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

