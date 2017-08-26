'LexicalScopeImpl' @ [36:16] ==> @JvmOverloads public constructor LexicalScopeImpl(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, redeclarationChecker: LocalRedeclarationChecker = ..., initialize: LexicalScopeImpl.InitializeHandler.() -> Unit = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl[DeserializedClassConstructorDescriptor]

'parent' @ [36:33] ==> value-parameter parent: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.scopeWithGenerics[ValueParameterDescriptorImpl]

'classDescriptor' @ [36:41] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'CLASS_HEADER' @ [36:88] ==> enum entry CLASS_HEADER defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'classDescriptor' @ [37:13] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'declaredTypeParameters' @ [37:29] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'forEach' @ [37:52] ==> @HidesMembers public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.forEach(action: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'addClassifierDescriptor' @ [37:62] ==> public final fun addClassifierDescriptor(classifierDescriptor: ClassifierDescriptor): Unit defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl.InitializeHandler[DeserializedSimpleFunctionDescriptor]

'it' @ [37:86] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.scopeWithGenerics.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'storageManager' @ [41:61] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [41:76] ==> public abstract fun <T : Any> createLazyValue(computable: () -> LexicalScopeImpl): NotNullLazyValue<LexicalScopeImpl> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LexicalScopeImpl

'scopeWithGenerics' @ [42:9] ==> private final fun scopeWithGenerics(parent: LexicalScope): LexicalScopeImpl defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]

'invoke' @ [42:27] ==> public abstract operator fun invoke(): LexicalScope defined in kotlin.Function0[FunctionInvokeDescriptor]

'storageManager' @ [45:67] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [45:82] ==> public abstract fun <T : Any> createLazyValue(computable: () -> LexicalScopeImpl): NotNullLazyValue<LexicalScopeImpl> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LexicalScopeImpl

'scopeWithGenerics' @ [46:9] ==> private final fun scopeWithGenerics(parent: LexicalScope): LexicalScopeImpl defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]

'invoke' @ [46:27] ==> public abstract operator fun invoke(): LexicalScope defined in kotlin.Function0[FunctionInvokeDescriptor]

'storageManager' @ [49:65] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [49:80] ==> private final fun <T : Any> StorageManager.createLazyValue(onRecursion: (Boolean) -> LexicalScope, compute: () -> LexicalScope): NotNullLazyValue<LexicalScope> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> LexicalScope

'createThrowingLexicalScope' @ [49:110] ==> private final val createThrowingLexicalScope: (Boolean) -> LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.Companion[PropertyDescriptorImpl]

'classDescriptor' @ [50:9] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'getAllSuperclassesWithoutAny' @ [50:25] ==> public fun ClassDescriptor.getAllSuperclassesWithoutAny(): SmartList<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'asReversed' @ [50:56] ==> @JvmName public fun <T> MutableList<(ClassDescriptor..ClassDescriptor?)>.asReversed(): MutableList<(ClassDescriptor..ClassDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'fold' @ [50:69] ==> public inline fun <T, R> Iterable<(ClassDescriptor..ClassDescriptor?)>.fold(initial: LexicalScope, operation: (LexicalScope, (ClassDescriptor..ClassDescriptor?)) -> LexicalScope): LexicalScope defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)
    <R> -> LexicalScope

'invoke' @ [50:74] ==> public abstract operator fun invoke(): LexicalScope defined in kotlin.Function0[FunctionInvokeDescriptor]

'createInheritanceScope' @ [51:13] ==> private final fun createInheritanceScope(parent: LexicalScope, ownerDescriptor: DeclarationDescriptor, classDescriptor: ClassDescriptor, withCompanionObject: Boolean = ...): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]

'scope' @ [51:45] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.inheritanceScopeWithoutMe.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'classDescriptor' @ [51:70] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'currentClass' @ [51:105] ==> value-parameter currentClass: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.inheritanceScopeWithoutMe.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'storageManager' @ [55:62] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [55:77] ==> private final fun <T : Any> StorageManager.createLazyValue(onRecursion: (Boolean) -> LexicalScope, compute: () -> LexicalScope): NotNullLazyValue<LexicalScope> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> LexicalScope

'createThrowingLexicalScope' @ [55:107] ==> private final val createThrowingLexicalScope: (Boolean) -> LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.Companion[PropertyDescriptorImpl]

'createInheritanceScope' @ [56:9] ==> private final fun createInheritanceScope(parent: LexicalScope, ownerDescriptor: DeclarationDescriptor, classDescriptor: ClassDescriptor, withCompanionObject: Boolean = ...): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]

'invoke' @ [56:41] ==> public abstract operator fun invoke(): LexicalScope defined in kotlin.Function0[FunctionInvokeDescriptor]

'classDescriptor' @ [56:88] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'classDescriptor' @ [56:123] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'storageManager' @ [59:71] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [59:86] ==> private final fun <T : Any> StorageManager.createLazyValue(onRecursion: (Boolean) -> LexicalScope, compute: () -> LexicalScope): NotNullLazyValue<LexicalScope> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> LexicalScope

'createThrowingLexicalScope' @ [59:116] ==> private final val createThrowingLexicalScope: (Boolean) -> LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.Companion[PropertyDescriptorImpl]

'createInheritanceScope' @ [60:9] ==> private final fun createInheritanceScope(parent: LexicalScope, ownerDescriptor: DeclarationDescriptor, classDescriptor: ClassDescriptor, withCompanionObject: Boolean = ...): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]

'invoke' @ [60:32] ==> public abstract operator fun invoke(): LexicalScope defined in kotlin.Function0[FunctionInvokeDescriptor]

'classDescriptor' @ [60:61] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'classDescriptor' @ [60:78] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'storageManager' @ [63:67] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [63:82] ==> public abstract fun <T : Any> createLazyValue(computable: () -> LexicalScopeImpl): NotNullLazyValue<LexicalScopeImpl> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LexicalScopeImpl

'scopeWithGenerics' @ [64:33] ==> private final fun scopeWithGenerics(parent: LexicalScope): LexicalScopeImpl defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]

'invoke' @ [64:51] ==> public abstract operator fun invoke(): LexicalScope defined in kotlin.Function0[FunctionInvokeDescriptor]

'LexicalScopeImpl' @ [65:9] ==> @JvmOverloads public constructor LexicalScopeImpl(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, redeclarationChecker: LocalRedeclarationChecker = ..., initialize: LexicalScopeImpl.InitializeHandler.() -> Unit = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl[DeserializedClassConstructorDescriptor]

'scopeWithGenerics' @ [65:26] ==> val scopeWithGenerics: LexicalScopeImpl defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.scopeForMemberDeclarationResolution.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [65:45] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'classDescriptor' @ [65:68] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'thisAsReceiverParameter' @ [65:84] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'CLASS_MEMBER_SCOPE' @ [65:126] ==> enum entry CLASS_MEMBER_SCOPE defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'storageManager' @ [68:73] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [68:88] ==> private final fun <T : Any> StorageManager.createLazyValue(onRecursion: (Boolean) -> LexicalScope, compute: () -> LexicalScope): NotNullLazyValue<LexicalScope> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> LexicalScope

'createThrowingLexicalScope' @ [68:118] ==> private final val createThrowingLexicalScope: (Boolean) -> LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.Companion[PropertyDescriptorImpl]

'if (classDescriptor.kind.isSingleton) {
            scopeForMemberDeclarationResolution()
        }
        else {
            inheritanceScopeWithMe()
        }' @ [69:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LexicalScope, elseBranch: LexicalScope): LexicalScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LexicalScope

'classDescriptor' @ [69:13] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[PropertyDescriptorImpl]

'kind' @ [69:29] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [69:34] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'invoke' @ [70:13] ==> public abstract operator fun invoke(): LexicalScope defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [73:13] ==> public abstract operator fun invoke(): LexicalScope defined in kotlin.Function0[FunctionInvokeDescriptor]

'ArrayList' @ [83:28] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MemberScope

'staticScopes' @ [86:9] ==> val staticScopes: ArrayList<MemberScope> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'add' @ [86:22] ==> public open fun add(element: MemberScope): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'classDescriptor' @ [86:26] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'staticScope' @ [86:42] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'staticScopes' @ [88:9] ==> val staticScopes: ArrayList<MemberScope> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'add' @ [88:22] ==> public open fun add(element: MemberScope): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'classDescriptor' @ [88:26] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [88:42] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'if (withCompanionObject) {
            staticScopes.addIfNotNull(classDescriptor.companionObjectDescriptor?.unsubstitutedInnerClassesScope)
            implicitReceiver = classDescriptor.companionObjectDescriptor?.thisAsReceiverParameter

            parentForNewScope = classDescriptor.companionObjectDescriptor?.let {
                it.getAllSuperclassesWithoutAny().asReversed().fold(parent) { scope, currentClass ->
                    createInheritanceScope(parent = scope, ownerDescriptor = ownerDescriptor, classDescriptor = currentClass, withCompanionObject = false)
                }
            } ?: parent
        }
        else {
            implicitReceiver = null
            parentForNewScope = parent
        }' @ [94:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'withCompanionObject' @ [94:13] ==> value-parameter withCompanionObject: Boolean = ... defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'staticScopes' @ [95:13] ==> val staticScopes: ArrayList<MemberScope> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'addIfNotNull' @ [95:26] ==> public fun <T : Any> MutableCollection<MemberScope>.addIfNotNull(t: MemberScope?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> MemberScope

'classDescriptor' @ [95:39] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [95:55] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'unsubstitutedInnerClassesScope' @ [95:82] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'implicitReceiver' @ [96:13] ==> val implicitReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'classDescriptor' @ [96:32] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [96:48] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'thisAsReceiverParameter' @ [96:75] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'parentForNewScope' @ [98:13] ==> val parentForNewScope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'classDescriptor' @ [98:33] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [98:49] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'let' @ [98:76] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> LexicalScope): LexicalScope defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> LexicalScope

'it' @ [99:17] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope.<anonymous>[ValueParameterDescriptorImpl]

'getAllSuperclassesWithoutAny' @ [99:20] ==> public fun ClassDescriptor.getAllSuperclassesWithoutAny(): SmartList<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'asReversed' @ [99:51] ==> @JvmName public fun <T> MutableList<(ClassDescriptor..ClassDescriptor?)>.asReversed(): MutableList<(ClassDescriptor..ClassDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'fold' @ [99:64] ==> public inline fun <T, R> Iterable<(ClassDescriptor..ClassDescriptor?)>.fold(initial: LexicalScope, operation: (LexicalScope, (ClassDescriptor..ClassDescriptor?)) -> LexicalScope): LexicalScope defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)
    <R> -> LexicalScope

'parent' @ [99:69] ==> value-parameter parent: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'createInheritanceScope' @ [100:21] ==> private final fun createInheritanceScope(parent: LexicalScope, ownerDescriptor: DeclarationDescriptor, classDescriptor: ClassDescriptor, withCompanionObject: Boolean = ...): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[SimpleFunctionDescriptorImpl]

'scope' @ [100:53] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [100:78] ==> value-parameter ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'currentClass' @ [100:113] ==> value-parameter currentClass: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [102:18] ==> value-parameter parent: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'implicitReceiver' @ [105:13] ==> val implicitReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'parentForNewScope' @ [106:13] ==> val parentForNewScope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'parent' @ [106:33] ==> value-parameter parent: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'LexicalChainedScope' @ [109:16] ==> @JvmOverloads public constructor LexicalChainedScope(parent: LexicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, memberScopes: List<MemberScope>, isStaticScope: Boolean = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalChainedScope[DeserializedClassConstructorDescriptor]

'parentForNewScope' @ [109:36] ==> val parentForNewScope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'ownerDescriptor' @ [109:55] ==> value-parameter ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[ValueParameterDescriptorImpl]

'implicitReceiver' @ [110:36] ==> val implicitReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'CLASS_INHERITANCE' @ [111:53] ==> enum entry CLASS_INHERITANCE defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'staticScopes' @ [112:51] ==> val staticScopes: ArrayList<MemberScope> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createInheritanceScope[LocalVariableDescriptor]

'createLazyValueWithPostCompute' @ [116:13] ==> public abstract fun <T : Any> createLazyValueWithPostCompute(computable: () -> T, onRecursiveCall: ((Boolean) -> T)?, postCompute: (T) -> Unit): NotNullLazyValue<T> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'compute' @ [116:44] ==> value-parameter compute: () -> T defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createLazyValue[ValueParameterDescriptorImpl]

'onRecursion' @ [116:53] ==> value-parameter onRecursion: (Boolean) -> T defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport.createLazyValue[ValueParameterDescriptorImpl]

'ThrowingLexicalScope' @ [119:80] ==> public constructor ThrowingLexicalScope() defined in org.jetbrains.kotlin.resolve.scopes.utils.ThrowingLexicalScope[DeserializedClassConstructorDescriptor]

'LexicalScopeImpl' @ [128:12] ==> @JvmOverloads public constructor LexicalScopeImpl(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, redeclarationChecker: LocalRedeclarationChecker = ..., initialize: LexicalScopeImpl.InitializeHandler.() -> Unit = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl[DeserializedClassConstructorDescriptor]

'classDescriptor' @ [129:13] ==> value-parameter classDescriptor: LazyClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution[ValueParameterDescriptorImpl]

'scopeForMemberDeclarationResolution' @ [129:29] ==> public final val LazyClassDescriptor.scopeForMemberDeclarationResolution: LexicalScope[MyPropertyDescriptor]

'parentDescriptor' @ [130:13] ==> value-parameter parentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution[ValueParameterDescriptorImpl]

'CLASS_INITIALIZER' @ [133:30] ==> enum entry CLASS_INITIALIZER defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'primaryConstructorParameters' @ [135:13] ==> value-parameter primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution[ValueParameterDescriptorImpl]

'isNotEmpty' @ [135:42] ==> @InlineOnly public inline fun <T> Collection<KtParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'classDescriptor' @ [136:40] ==> value-parameter classDescriptor: LazyClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution[ValueParameterDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [136:56] ==> public final val LazyClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'valueParameters' @ [136:90] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'assert' @ [137:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parameterDescriptors' @ [137:20] ==> val parameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution.<anonymous>[LocalVariableDescriptor]

'size' @ [137:41] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'primaryConstructorParameters' @ [137:49] ==> value-parameter primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution[ValueParameterDescriptorImpl]

'size' @ [137:78] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [138:19] ==> public final operator fun component1(): KtParameter defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [138:30] ==> public final operator fun component2(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'primaryConstructorParameters' @ [138:45] ==> value-parameter primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution[ValueParameterDescriptorImpl]

'zip' @ [138:74] ==> public infix fun <T, R> Iterable<KtParameter>.zip(other: Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>): List<Pair<KtParameter, (ValueParameterDescriptor..ValueParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <R> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'parameterDescriptors' @ [138:78] ==> val parameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution.<anonymous>[LocalVariableDescriptor]

'!' @ [139:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [139:22] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution.<anonymous>[LocalVariableDescriptor]

'hasValOrVar' @ [139:32] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'addVariableDescriptor' @ [140:21] ==> public final fun addVariableDescriptor(variableDescriptor: VariableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl.InitializeHandler[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [140:43] ==> val descriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.scopeForInitializerResolution.<anonymous>[LocalVariableDescriptor]

