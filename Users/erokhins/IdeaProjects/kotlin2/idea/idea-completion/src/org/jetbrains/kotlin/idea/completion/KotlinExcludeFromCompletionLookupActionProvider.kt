'element' @ [34:28] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.fillActions[ValueParameterDescriptorImpl]

'`object`' @ [34:36] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'lookup' @ [36:23] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.fillActions[ValueParameterDescriptorImpl]

'psiFile' @ [36:30] ==> public final val Lookup.psiFile: PsiFile?[MyPropertyDescriptor]

'project' @ [36:39] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'lookupObject' @ [38:9] ==> val lookupObject: DeclarationLookupObject defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.fillActions[LocalVariableDescriptor]

'importableFqName' @ [38:22] ==> public abstract val importableFqName: FqName? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'let' @ [38:40] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> Nothing

'addExcludes' @ [39:13] ==> private final fun addExcludes(consumer: Consumer<LookupElementAction>, project: Project, fqName: String): Unit defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider[SimpleFunctionDescriptorImpl]

'consumer' @ [39:25] ==> value-parameter consumer: Consumer<LookupElementAction> defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.fillActions[ValueParameterDescriptorImpl]

'project' @ [39:35] ==> val project: Project defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.fillActions[LocalVariableDescriptor]

'it' @ [39:44] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.fillActions.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [39:47] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'iterator' @ [45:19] ==> public abstract fun iterator(): MutableIterator<(String..String?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'getAllExcludableStrings' @ [45:35] ==> public open fun getAllExcludableStrings(@NotNull p0: String): (MutableList<(String..String?)>..List<(String..String?)>?) defined in com.intellij.codeInsight.daemon.impl.actions.AddImportAction[JavaMethodDescriptor]

'fqName' @ [45:59] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.addExcludes[ValueParameterDescriptorImpl]

'consumer' @ [46:13] ==> value-parameter consumer: Consumer<LookupElementAction> defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.addExcludes[ValueParameterDescriptorImpl]

'consume' @ [46:22] ==> public abstract fun consume(p0: (LookupElementAction..LookupElementAction?)): Unit defined in com.intellij.util.Consumer[JavaMethodDescriptor]

'ExcludeFromCompletionAction' @ [46:30] ==> public constructor ExcludeFromCompletionAction(project: Project, exclude: String) defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.ExcludeFromCompletionAction[ClassConstructorDescriptorImpl]

'project' @ [46:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.addExcludes[ValueParameterDescriptorImpl]

's' @ [46:67] ==> val s: (String..String?) defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.addExcludes[LocalVariableDescriptor]

'LookupElementAction' @ [53:9] ==> protected/*protected and package*/ constructor LookupElementAction(@Nullable p0: Icon?, @NotNull p1: String) defined in com.intellij.codeInsight.lookup.LookupElementAction[JavaClassConstructorDescriptor]

'exclude' @ [53:46] ==> value-parameter exclude: String defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.ExcludeFromCompletionAction.<init>[ValueParameterDescriptorImpl]

'excludeFromImport' @ [55:29] ==> public open fun excludeFromImport(p0: (Project..Project?), p1: (String..String?)): Unit defined in com.intellij.codeInsight.daemon.impl.actions.AddImportAction[JavaMethodDescriptor]

'project' @ [55:47] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.ExcludeFromCompletionAction[PropertyDescriptorImpl]

'exclude' @ [55:56] ==> private final val exclude: String defined in org.jetbrains.kotlin.idea.completion.KotlinExcludeFromCompletionLookupActionProvider.ExcludeFromCompletionAction[PropertyDescriptorImpl]

'HIDE_LOOKUP' @ [56:47] ==> public final val HIDE_LOOKUP: (LookupElementAction.Result..LookupElementAction.Result?) defined in com.intellij.codeInsight.lookup.LookupElementAction.Result[JavaPropertyDescriptor]

