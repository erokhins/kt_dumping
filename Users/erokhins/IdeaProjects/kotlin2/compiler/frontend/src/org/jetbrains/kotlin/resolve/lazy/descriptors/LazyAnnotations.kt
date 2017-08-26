'LazyAnnotationsContext' @ [50:5] ==> public constructor LazyAnnotationsContext(annotationResolver: AnnotationResolver, storageManager: StorageManager, trace: BindingTrace) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[ClassConstructorDescriptorImpl]

'annotationResolver' @ [50:28] ==> value-parameter annotationResolver: AnnotationResolver defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContextImpl.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [50:48] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContextImpl.<init>[ValueParameterDescriptorImpl]

'trace' @ [50:64] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContextImpl.<init>[ValueParameterDescriptorImpl]

'annotationEntries' @ [56:30] ==> public final val annotationEntries: List<KtAnnotationEntry> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations[PropertyDescriptorImpl]

'isEmpty' @ [56:48] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'c' @ [58:30] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations[PropertyDescriptorImpl]

'storageManager' @ [58:32] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'createMemoizedFunction' @ [58:47] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (KtAnnotationEntry) -> AnnotationWithTarget): MemoizedFunctionToNotNull<KtAnnotationEntry, AnnotationWithTarget> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtAnnotationEntry
    <V : Any> -> AnnotationWithTarget

'LazyAnnotationDescriptor' @ [61:26] ==> public constructor LazyAnnotationDescriptor(c: LazyAnnotationsContext, annotationEntry: KtAnnotationEntry) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[ClassConstructorDescriptorImpl]

'c' @ [61:51] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations[PropertyDescriptorImpl]

'entry' @ [61:54] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.annotation.<anonymous>[ValueParameterDescriptorImpl]

'entry' @ [62:22] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.annotation.<anonymous>[ValueParameterDescriptorImpl]

'useSiteTarget' @ [62:28] ==> public final val KtAnnotationEntry.useSiteTarget: KtAnnotationUseSiteTarget?[MyPropertyDescriptor]

'getAnnotationUseSiteTarget' @ [62:43] ==> public final fun getAnnotationUseSiteTarget(): AnnotationUseSiteTarget defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget[SimpleFunctionDescriptorImpl]

'AnnotationWithTarget' @ [63:9] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedClassConstructorDescriptor]

'descriptor' @ [63:30] ==> val descriptor: LazyAnnotationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.annotation.<anonymous>[LocalVariableDescriptor]

'target' @ [63:42] ==> val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.annotation.<anonymous>[LocalVariableDescriptor]

'annotationEntries' @ [67:16] ==> public final val annotationEntries: List<KtAnnotationEntry> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations[PropertyDescriptorImpl]

'mapNotNull' @ [68:18] ==> public inline fun <T, R : Any> Iterable<KtAnnotationEntry>.mapNotNull(transform: (KtAnnotationEntry) -> AnnotationWithTarget?): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry
    <R : Any> -> AnnotationWithTarget

'component1' @ [69:26] ==> public final operator fun component1(): AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedSimpleFunctionDescriptor]

'component2' @ [69:38] ==> public final operator fun component2(): AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedSimpleFunctionDescriptor]

'invoke' @ [69:48] ==> public abstract fun invoke(p1: KtAnnotationEntry): AnnotationWithTarget defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'it' @ [69:59] ==> value-parameter it: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.getUseSiteTargetedAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'if (target == null) null else AnnotationWithTarget(descriptor, target)' @ [70:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnnotationWithTarget?, elseBranch: AnnotationWithTarget?): AnnotationWithTarget?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnnotationWithTarget?

'target' @ [70:25] ==> val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.getUseSiteTargetedAnnotations.<anonymous>[LocalVariableDescriptor]

'AnnotationWithTarget' @ [70:51] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedClassConstructorDescriptor]

'descriptor' @ [70:72] ==> val descriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.getUseSiteTargetedAnnotations.<anonymous>[LocalVariableDescriptor]

'target' @ [70:84] ==> val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.getUseSiteTargetedAnnotations.<anonymous>[LocalVariableDescriptor]

'annotationEntries' @ [74:40] ==> public final val annotationEntries: List<KtAnnotationEntry> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations[PropertyDescriptorImpl]

'map' @ [74:58] ==> public inline fun <T, R> Iterable<KtAnnotationEntry>.map(transform: (KtAnnotationEntry) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry
    <R> -> AnnotationWithTarget

'annotation' @ [74:62] ==> private final val annotation: MemoizedFunctionToNotNull<KtAnnotationEntry, AnnotationWithTarget> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations[PropertyDescriptorImpl]

'annotationEntries' @ [77:16] ==> public final val annotationEntries: List<KtAnnotationEntry> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations[PropertyDescriptorImpl]

'asSequence' @ [78:18] ==> public fun <T> Iterable<KtAnnotationEntry>.asSequence(): Sequence<KtAnnotationEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'mapNotNull' @ [79:18] ==> public fun <T, R : Any> Sequence<KtAnnotationEntry>.mapNotNull(transform: (KtAnnotationEntry) -> AnnotationDescriptor?): Sequence<AnnotationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry
    <R : Any> -> AnnotationDescriptor

'component1' @ [80:26] ==> public final operator fun component1(): AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedSimpleFunctionDescriptor]

'component2' @ [80:38] ==> public final operator fun component2(): AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedSimpleFunctionDescriptor]

'invoke' @ [80:48] ==> public abstract fun invoke(p1: KtAnnotationEntry): AnnotationWithTarget defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'it' @ [80:59] ==> value-parameter it: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.iterator.<anonymous>[ValueParameterDescriptorImpl]

'if (target == null) descriptor else null' @ [81:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnnotationDescriptor?, elseBranch: AnnotationDescriptor?): AnnotationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnnotationDescriptor?

'target' @ [81:25] ==> val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.iterator.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [81:41] ==> val descriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations.iterator.<anonymous>[LocalVariableDescriptor]

'iterator' @ [82:19] ==> public abstract operator fun iterator(): Iterator<AnnotationDescriptor> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'getAllAnnotations' @ [87:9] ==> public open fun getAllAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotations[SimpleFunctionDescriptorImpl]

'c' @ [97:9] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'trace' @ [97:11] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'record' @ [97:17] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?), key: (KtAnnotationEntry..KtAnnotationEntry?), value: (AnnotationDescriptor..AnnotationDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtAnnotationEntry
    <V : (Any..Any?)> -> AnnotationDescriptor

'ANNOTATION' @ [97:39] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'annotationEntry' @ [97:51] ==> public final val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'this' @ [97:68] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[LazyClassReceiverParameterDescriptor]

'c' @ [100:26] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'storageManager' @ [100:28] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'createLazyValue' @ [100:43] ==> public abstract fun <T : Any> createLazyValue(computable: () -> KotlinType): NotNullLazyValue<KotlinType> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KotlinType

'c' @ [101:9] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'annotationResolver' @ [101:11] ==> public final val annotationResolver: AnnotationResolver defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'resolveAnnotationType' @ [101:30] ==> public abstract fun resolveAnnotationType(scope: LexicalScope, entryElement: KtAnnotationEntry, trace: BindingTrace): KotlinType defined in org.jetbrains.kotlin.resolve.AnnotationResolver[SimpleFunctionDescriptorImpl]

'scope' @ [101:52] ==> private final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'annotationEntry' @ [101:59] ==> public final val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'c' @ [101:76] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'trace' @ [101:78] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'annotationEntry' @ [104:27] ==> public final val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'toSourceElement' @ [104:43] ==> public fun KtPureElement?.toSourceElement(): SourceElement defined in org.jetbrains.kotlin.resolve.source in file KotlinSourceElement.kt[SimpleFunctionDescriptorImpl]

'if (c.scope.ownerDescriptor is PackageFragmentDescriptor) {
        LexicalScope.Base(c.scope, FileDescriptorForVisibilityChecks(source, c.scope.ownerDescriptor))
    }
    else {
        c.scope
    }' @ [106:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LexicalScope, elseBranch: LexicalScope): LexicalScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LexicalScope

'c' @ [106:29] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'scope' @ [106:31] ==> public abstract val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'ownerDescriptor' @ [106:37] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'Base' @ [107:22] ==> public constructor Base(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope.Base[DeserializedClassConstructorDescriptor]

'c' @ [107:27] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'scope' @ [107:29] ==> public abstract val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'FileDescriptorForVisibilityChecks' @ [107:36] ==> public constructor FileDescriptorForVisibilityChecks(source: SourceElement, containingDeclaration: DeclarationDescriptor) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.FileDescriptorForVisibilityChecks[ClassConstructorDescriptorImpl]

'source' @ [107:70] ==> public open val source: SourceElement defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'c' @ [107:78] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'scope' @ [107:80] ==> public abstract val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'ownerDescriptor' @ [107:86] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'c' @ [110:9] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'scope' @ [110:11] ==> public abstract val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'c' @ [113:39] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'storageManager' @ [113:41] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'createLazyValue' @ [113:56] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<Name, ConstantValue<*>>): NotNullLazyValue<Map<Name, ConstantValue<*>>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Map<Name, ConstantValue<*>>

'c' @ [114:33] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'annotationResolver' @ [114:35] ==> public final val annotationResolver: AnnotationResolver defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'resolveAnnotationCall' @ [114:54] ==> public abstract fun resolveAnnotationCall(annotationEntry: KtAnnotationEntry, scope: LexicalScope, trace: BindingTrace): OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.AnnotationResolver[SimpleFunctionDescriptorImpl]

'annotationEntry' @ [114:76] ==> public final val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'scope' @ [114:93] ==> private final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'c' @ [114:100] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'trace' @ [114:102] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'checkAnnotationType' @ [115:32] ==> public open fun checkAnnotationType(@NotNull entryElement: KtAnnotationEntry, @NotNull trace: BindingTrace, @NotNull results: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.AnnotationResolverImpl[JavaMethodDescriptor]

'annotationEntry' @ [115:52] ==> public final val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'c' @ [115:69] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'trace' @ [115:71] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'resolutionResults' @ [115:78] ==> val resolutionResults: OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.allValueArguments.<anonymous>[LocalVariableDescriptor]

'!' @ [117:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolutionResults' @ [117:14] ==> val resolutionResults: OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.allValueArguments.<anonymous>[LocalVariableDescriptor]

'isSingleResult' @ [117:32] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<FunctionDescriptor>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'emptyMap' @ [117:71] ==> public fun <K, V> emptyMap(): Map<Name, ConstantValue<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'resolutionResults' @ [119:9] ==> val resolutionResults: OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.allValueArguments.<anonymous>[LocalVariableDescriptor]

'resultingCall' @ [119:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<FunctionDescriptor>.resultingCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'valueArguments' @ [119:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'mapNotNull' @ [119:56] ==> public inline fun <K, V, R : Any> Map<out (ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.mapNotNull(transform: (Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>) -> Pair<Name, ConstantValue<Any?>>?): List<Pair<Name, ConstantValue<Any?>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)
    <R : Any> -> Pair<Name, ConstantValue<Any?>>

'component1' @ [119:70] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component1(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'component2' @ [119:86] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component2(): (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'if (resolvedArgument == null) null
            else c.annotationResolver.getAnnotationArgumentValue(c.trace, valueParameter, resolvedArgument)?.let { value ->
                valueParameter.name to value
            }' @ [120:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Name, ConstantValue<Any?>>?, elseBranch: Pair<Name, ConstantValue<Any?>>?): Pair<Name, ConstantValue<Any?>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Name, ConstantValue<Any?>>?

'resolvedArgument' @ [120:17] ==> val resolvedArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.allValueArguments.<anonymous>.<anonymous>[LocalVariableDescriptor]

'c' @ [121:18] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'annotationResolver' @ [121:20] ==> public final val annotationResolver: AnnotationResolver defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'getAnnotationArgumentValue' @ [121:39] ==> public abstract fun getAnnotationArgumentValue(trace: BindingTrace, valueParameter: ValueParameterDescriptor, resolvedArgument: ResolvedValueArgument): ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.AnnotationResolver[SimpleFunctionDescriptorImpl]

'c' @ [121:66] ==> public final val c: LazyAnnotationsContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'trace' @ [121:68] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationsContext[PropertyDescriptorImpl]

'valueParameter' @ [121:75] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.allValueArguments.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolvedArgument' @ [121:91] ==> val resolvedArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.allValueArguments.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [121:110] ==> @InlineOnly public inline fun <T, R> ConstantValue<Any?>.let(block: (ConstantValue<Any?>) -> Pair<Name, ConstantValue<Any?>>): Pair<Name, ConstantValue<Any?>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<Any?>
    <R> -> Pair<Name, ConstantValue<Any?>>

'valueParameter' @ [122:17] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.allValueArguments.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [122:32] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'value' @ [122:40] ==> value-parameter value: ConstantValue<Any?> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.allValueArguments.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [124:11] ==> public fun <K, V> Iterable<Pair<Name, ConstantValue<Any?>>>.toMap(): Map<Name, ConstantValue<Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<Any?>

'forceResolveAllContents' @ [128:26] ==> @Nullable public open fun forceResolveAllContents(@Nullable type: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'type' @ [128:50] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'allValueArguments' @ [129:9] ==> public open val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor[PropertyDescriptorImpl]

'Annotations' @ [136:55] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [136:67] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'containingDeclaration' @ [137:51] ==> private final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.FileDescriptorForVisibilityChecks[PropertyDescriptorImpl]

'source' @ [138:36] ==> private final val source: SourceElement defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.FileDescriptorForVisibilityChecks[PropertyDescriptorImpl]

'this' @ [139:38] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.FileDescriptorForVisibilityChecks[LazyClassReceiverParameterDescriptor]

'special' @ [140:39] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'error' @ [142:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'error' @ [143:110] ==> private final fun error(): Nothing defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.FileDescriptorForVisibilityChecks[SimpleFunctionDescriptorImpl]

'error' @ [144:87] ==> private final fun error(): Nothing defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyAnnotationDescriptor.FileDescriptorForVisibilityChecks[SimpleFunctionDescriptorImpl]

'name' @ [146:46] ==> public final val LazyAnnotationDescriptor.FileDescriptorForVisibilityChecks.name: Name[MyPropertyDescriptor]

'asString' @ [146:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

