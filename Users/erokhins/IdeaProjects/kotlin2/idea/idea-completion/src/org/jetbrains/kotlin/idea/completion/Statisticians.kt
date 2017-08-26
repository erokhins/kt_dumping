'CompletionStatistician' @ [37:38] ==> public constructor CompletionStatistician() defined in com.intellij.codeInsight.completion.CompletionStatistician[JavaClassConstructorDescriptor]

'?:' @ [39:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeclarationLookupObject?, right: DeclarationLookupObject): DeclarationLookupObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DeclarationLookupObject

'element' @ [39:18] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionStatistician.serialize[ValueParameterDescriptorImpl]

'`object`' @ [39:26] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'element' @ [41:23] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionStatistician.serialize[ValueParameterDescriptorImpl]

'getUserDataDeep' @ [41:31] ==> public tailrec fun <T : Any> LookupElement.getUserDataDeep(key: Key<String>): String? defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> String

'STATISTICS_INFO_CONTEXT_KEY' @ [41:47] ==> public val STATISTICS_INFO_CONTEXT_KEY: Key<String> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'if (o.descriptor != null) {
            return KotlinStatisticsInfo.forDescriptor(o.descriptor!!.original, context)
        }
        else {
            val fqName = o.importableFqName ?: return StatisticsInfo.EMPTY
            return StatisticsInfo(context, fqName.asString())
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'o' @ [43:13] ==> val o: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionStatistician.serialize[LocalVariableDescriptor]

'descriptor' @ [43:15] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'KotlinStatisticsInfo' @ [44:20] ==> public object KotlinStatisticsInfo defined in org.jetbrains.kotlin.idea.completion in file Statisticians.kt[FakeCallableDescriptorForObject]

'forDescriptor' @ [44:41] ==> public final fun forDescriptor(descriptor: DeclarationDescriptor, context: String = ...): StatisticsInfo defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo[SimpleFunctionDescriptorImpl]

'o' @ [44:55] ==> val o: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionStatistician.serialize[LocalVariableDescriptor]

'descriptor' @ [44:57] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'original' @ [44:70] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'context' @ [44:80] ==> val context: String defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionStatistician.serialize[LocalVariableDescriptor]

'o' @ [47:26] ==> val o: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionStatistician.serialize[LocalVariableDescriptor]

'importableFqName' @ [47:28] ==> public abstract val importableFqName: FqName? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'EMPTY' @ [47:70] ==> public final val EMPTY: (StatisticsInfo..StatisticsInfo?) defined in com.intellij.psi.statistics.StatisticsInfo[JavaPropertyDescriptor]

'StatisticsInfo' @ [48:20] ==> public constructor StatisticsInfo(@NonNls @NotNull p0: String, @NonNls @NotNull p1: String) defined in com.intellij.psi.statistics.StatisticsInfo[JavaClassConstructorDescriptor]

'context' @ [48:35] ==> val context: String defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionStatistician.serialize[LocalVariableDescriptor]

'fqName' @ [48:44] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionStatistician.serialize[LocalVariableDescriptor]

'asString' @ [48:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'ProximityStatistician' @ [53:37] ==> public constructor ProximityStatistician() defined in com.intellij.psi.util.proximity.ProximityStatistician[JavaClassConstructorDescriptor]

'element' @ [55:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.completion.KotlinProximityStatistician.serialize[ValueParameterDescriptorImpl]

'element' @ [56:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.completion.KotlinProximityStatistician.serialize[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [56:34] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'KotlinStatisticsInfo' @ [57:16] ==> public object KotlinStatisticsInfo defined in org.jetbrains.kotlin.idea.completion in file Statisticians.kt[FakeCallableDescriptorForObject]

'forDescriptor' @ [57:37] ==> public final fun forDescriptor(descriptor: DeclarationDescriptor, context: String = ...): StatisticsInfo defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo[SimpleFunctionDescriptorImpl]

'descriptor' @ [57:51] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KotlinProximityStatistician.serialize[LocalVariableDescriptor]

'DescriptorRenderer' @ [62:38] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [62:57] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'withDefinedIn' @ [63:9] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'withoutReturnType' @ [64:9] ==> public abstract var withoutReturnType: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'startFromName' @ [65:9] ==> public abstract var startFromName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'receiverAfterName' @ [66:9] ==> public abstract var receiverAfterName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'modifiers' @ [67:9] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [67:21] ==> public fun <T> emptySet(): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'defaultParameterValueRenderer' @ [68:9] ==> public abstract var defaultParameterValueRenderer: ((ValueParameterDescriptor) -> String)? defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'parameterNameRenderingPolicy' @ [69:9] ==> public abstract var parameterNameRenderingPolicy: ParameterNameRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'NONE' @ [69:69] ==> enum entry NONE defined in org.jetbrains.kotlin.renderer.ParameterNameRenderingPolicy[FakeCallableDescriptorForObject]

'descriptor' @ [73:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [74:20] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[ValueParameterDescriptorImpl]

'importableFqName' @ [74:31] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'let' @ [74:49] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> StatisticsInfo): StatisticsInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> StatisticsInfo

'StatisticsInfo' @ [74:55] ==> public constructor StatisticsInfo(@NonNls @NotNull p0: String, @NonNls @NotNull p1: String) defined in com.intellij.psi.statistics.StatisticsInfo[JavaClassConstructorDescriptor]

'it' @ [74:74] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [74:77] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'EMPTY' @ [74:109] ==> public final val EMPTY: (StatisticsInfo..StatisticsInfo?) defined in com.intellij.psi.statistics.StatisticsInfo[JavaPropertyDescriptor]

'descriptor' @ [77:25] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [77:36] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'when (container) {
                                  is ClassDescriptor -> container.importableFqName?.asString()
                                  is PackageFragmentDescriptor -> container.fqName.asString()
                                  is ModuleDescriptor -> ""
                                  else -> null
                              }' @ [78:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'container' @ [78:37] ==> val container: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[LocalVariableDescriptor]

'container' @ [79:57] ==> val container: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[LocalVariableDescriptor]

'importableFqName' @ [79:67] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'asString' @ [79:85] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'container' @ [80:67] ==> val container: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[LocalVariableDescriptor]

'fqName' @ [80:77] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'asString' @ [80:84] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'EMPTY' @ [83:59] ==> public final val EMPTY: (StatisticsInfo..StatisticsInfo?) defined in com.intellij.psi.statistics.StatisticsInfo[JavaPropertyDescriptor]

'SIGNATURE_RENDERER' @ [84:25] ==> private final val SIGNATURE_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo[PropertyDescriptorImpl]

'render' @ [84:44] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [84:51] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[ValueParameterDescriptorImpl]

'StatisticsInfo' @ [85:16] ==> public constructor StatisticsInfo(@NonNls @NotNull p0: String, @NonNls @NotNull p1: String) defined in com.intellij.psi.statistics.StatisticsInfo[JavaClassConstructorDescriptor]

'context' @ [85:31] ==> value-parameter context: String = ... defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[ValueParameterDescriptorImpl]

'containerFqName' @ [85:42] ==> val containerFqName: String defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[LocalVariableDescriptor]

'signature' @ [85:61] ==> val signature: String defined in org.jetbrains.kotlin.idea.completion.KotlinStatisticsInfo.forDescriptor[LocalVariableDescriptor]

