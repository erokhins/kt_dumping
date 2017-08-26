'create' @ [28:105] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (HashMultimap<(DiagnosticFactory<*>..DiagnosticFactory<*>?), (KotlinIntentionActionsFactory..KotlinIntentionActionsFactory?)>..HashMultimap<(DiagnosticFactory<*>..DiagnosticFactory<*>?), (KotlinIntentionActionsFactory..KotlinIntentionActionsFactory?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> DiagnosticFactory<*>
    <V : (Any..Any?)> -> KotlinIntentionActionsFactory

'create' @ [29:89] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (HashMultimap<(DiagnosticFactory<*>..DiagnosticFactory<*>?), (IntentionAction..IntentionAction?)>..HashMultimap<(DiagnosticFactory<*>..DiagnosticFactory<*>?), (IntentionAction..IntentionAction?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> DiagnosticFactory<*>
    <V : (Any..Any?)> -> IntentionAction

'getExtensions' @ [32:20] ==> @NotNull public open fun <T : (Any..Any?)> getExtensions(@NotNull p0: ExtensionPointName<(QuickFixContributor..QuickFixContributor?)>): (Array<(QuickFixContributor..QuickFixContributor?)>..Array<out (QuickFixContributor..QuickFixContributor?)>) defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.QuickFixContributor..org.jetbrains.kotlin.idea.quickfix.QuickFixContributor?)

'EP_NAME' @ [32:54] ==> public final val EP_NAME: ExtensionPointName<QuickFixContributor> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixContributor.Companion[PropertyDescriptorImpl]

'forEach' @ [32:63] ==> public inline fun <T> Array<out (QuickFixContributor..QuickFixContributor?)>.forEach(action: ((QuickFixContributor..QuickFixContributor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.quickfix.QuickFixContributor..org.jetbrains.kotlin.idea.quickfix.QuickFixContributor?)

'it' @ [32:73] ==> value-parameter it: (QuickFixContributor..QuickFixContributor?) defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.<init>.<anonymous>[ValueParameterDescriptorImpl]

'registerQuickFixes' @ [32:76] ==> public abstract fun registerQuickFixes(quickFixes: QuickFixes): Unit defined in org.jetbrains.kotlin.idea.quickfix.QuickFixContributor[SimpleFunctionDescriptorImpl]

'this' @ [32:95] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[LazyClassReceiverParameterDescriptor]

'factories' @ [36:9] ==> private final val factories: Multimap<DiagnosticFactory<*>, KotlinIntentionActionsFactory> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[PropertyDescriptorImpl]

'putAll' @ [36:19] ==> @CanIgnoreReturnValue public abstract fun putAll(@Nullable p0: DiagnosticFactory<*>?, p1: (MutableIterable<(KotlinIntentionActionsFactory..KotlinIntentionActionsFactory?)>..Iterable<(KotlinIntentionActionsFactory..KotlinIntentionActionsFactory?)>?)): Boolean defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'diagnosticFactory' @ [36:26] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.register[ValueParameterDescriptorImpl]

'factory' @ [36:45] ==> value-parameter vararg factory: KotlinIntentionActionsFactory defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.register[ValueParameterDescriptorImpl]

'toList' @ [36:53] ==> public fun <T> Array<out KotlinIntentionActionsFactory>.toList(): List<KotlinIntentionActionsFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinIntentionActionsFactory

'actions' @ [40:9] ==> private final val actions: Multimap<DiagnosticFactory<*>, IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[PropertyDescriptorImpl]

'putAll' @ [40:17] ==> @CanIgnoreReturnValue public abstract fun putAll(@Nullable p0: DiagnosticFactory<*>?, p1: (MutableIterable<(IntentionAction..IntentionAction?)>..Iterable<(IntentionAction..IntentionAction?)>?)): Boolean defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'diagnosticFactory' @ [40:24] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.register[ValueParameterDescriptorImpl]

'action' @ [40:43] ==> value-parameter vararg action: IntentionAction defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.register[ValueParameterDescriptorImpl]

'toList' @ [40:50] ==> public fun <T> Array<out IntentionAction>.toList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'factories' @ [44:16] ==> private final val factories: Multimap<DiagnosticFactory<*>, KotlinIntentionActionsFactory> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[PropertyDescriptorImpl]

'get' @ [44:26] ==> public abstract operator fun get(@Nullable p0: DiagnosticFactory<*>?): (MutableCollection<(KotlinIntentionActionsFactory..KotlinIntentionActionsFactory?)>..Collection<(KotlinIntentionActionsFactory..KotlinIntentionActionsFactory?)>?) defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'diagnosticFactory' @ [44:30] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.getActionFactories[ValueParameterDescriptorImpl]

'actions' @ [48:16] ==> private final val actions: Multimap<DiagnosticFactory<*>, IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[PropertyDescriptorImpl]

'get' @ [48:24] ==> public abstract operator fun get(@Nullable p0: DiagnosticFactory<*>?): (MutableCollection<(IntentionAction..IntentionAction?)>..Collection<(IntentionAction..IntentionAction?)>?) defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'diagnosticFactory' @ [48:28] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.getActions[ValueParameterDescriptorImpl]

'factories' @ [52:16] ==> private final val factories: Multimap<DiagnosticFactory<*>, KotlinIntentionActionsFactory> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[PropertyDescriptorImpl]

'keySet' @ [52:26] ==> public abstract fun keySet(): (MutableSet<(DiagnosticFactory<*>..DiagnosticFactory<*>?)>..Set<(DiagnosticFactory<*>..DiagnosticFactory<*>?)>?) defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'filter' @ [52:35] ==> public inline fun <T> Iterable<(DiagnosticFactory<*>..DiagnosticFactory<*>?)>.filter(predicate: ((DiagnosticFactory<*>..DiagnosticFactory<*>?)) -> Boolean): List<(DiagnosticFactory<*>..DiagnosticFactory<*>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>?)

'factory' @ [52:44] ==> value-parameter factory: KotlinIntentionActionsFactory defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.getDiagnostics[ValueParameterDescriptorImpl]

'factories' @ [52:55] ==> private final val factories: Multimap<DiagnosticFactory<*>, KotlinIntentionActionsFactory> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[PropertyDescriptorImpl]

'get' @ [52:65] ==> public abstract operator fun get(@Nullable p0: DiagnosticFactory<*>?): (MutableCollection<(KotlinIntentionActionsFactory..KotlinIntentionActionsFactory?)>..Collection<(KotlinIntentionActionsFactory..KotlinIntentionActionsFactory?)>?) defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'it' @ [52:69] ==> value-parameter it: (DiagnosticFactory<*>..DiagnosticFactory<*>?) defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.getDiagnostics.<anonymous>[ValueParameterDescriptorImpl]

'getService' @ [56:56] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Class<(QuickFixes..QuickFixes?)>): (QuickFixes..QuickFixes?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.QuickFixes..org.jetbrains.kotlin.idea.quickfix.QuickFixes?)

'QuickFixes' @ [56:67] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[FakeCallableDescriptorForObject]

'java' @ [56:85] ==> public val <T> KClass<QuickFixes>.java: Class<QuickFixes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> QuickFixes

'create' @ [62:83] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): ExtensionPointName<(QuickFixContributor..QuickFixContributor?)> defined in com.intellij.openapi.extensions.ExtensionPointName[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.QuickFixContributor..org.jetbrains.kotlin.idea.quickfix.QuickFixContributor?)

