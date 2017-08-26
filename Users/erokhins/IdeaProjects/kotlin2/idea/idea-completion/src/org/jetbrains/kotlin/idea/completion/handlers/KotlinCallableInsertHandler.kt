'BaseDeclarationInsertHandler' @ [33:73] ==> public constructor BaseDeclarationInsertHandler() defined in org.jetbrains.kotlin.idea.completion.handlers.BaseDeclarationInsertHandler[ClassConstructorDescriptorImpl]

'super' @ [35:9] ==> <this> defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler[LazyClassReceiverParameterDescriptor]

'handleInsert' @ [35:15] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.BaseDeclarationInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [35:28] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'item' @ [35:37] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'addImport' @ [37:9] ==> private final fun addImport(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [37:19] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'item' @ [37:28] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'getInstance' @ [41:53] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [41:65] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'project' @ [41:73] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'psiDocumentManager' @ [42:9] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'commitAllDocuments' @ [42:28] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [44:20] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'file' @ [44:28] ==> public final val InsertionContext.file: PsiFile[MyPropertyDescriptor]

'item' @ [45:17] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'`object`' @ [45:22] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'file' @ [46:13] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'o' @ [46:31] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'o' @ [47:30] ==> val o: Any defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'descriptor' @ [47:32] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'if (descriptor.extensionReceiverParameter != null || callType == CallType.CALLABLE_REFERENCE) {
                if (DescriptorUtils.isTopLevelDeclaration(descriptor) && !descriptor.isArtificialImportAliasedDescriptor) {
                    ImportInsertHelper.getInstance(context.project).importDescriptor(file, descriptor)
                }
            }
            else if (callType == CallType.DEFAULT) {
                if (descriptor.isArtificialImportAliasedDescriptor) return
                val fqName = descriptor.importableFqName ?: return
                context.document.replaceString(context.startOffset, context.tailOffset, fqName.render() + " ") // insert space after for correct parsing

                psiDocumentManager.commitAllDocuments()

                ShortenReferences.DEFAULT.process(file, context.startOffset, context.tailOffset - 1)

                psiDocumentManager.doPostponedOperationsAndUnblockDocument(context.document)

                // delete space
                if (context.document.isTextAt(context.tailOffset - 1, " ")) { // sometimes space can be lost because of reformatting
                    context.document.deleteString(context.tailOffset - 1, context.tailOffset)
                }
            }' @ [48:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [48:17] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'extensionReceiverParameter' @ [48:28] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'callType' @ [48:66] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler[PropertyDescriptorImpl]

'CALLABLE_REFERENCE' @ [48:87] ==> public object CALLABLE_REFERENCE : CallType<KtExpression?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'isTopLevelDeclaration' @ [49:37] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [49:59] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'!' @ [49:74] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [49:75] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'isArtificialImportAliasedDescriptor' @ [49:86] ==> public val DeclarationDescriptor.isArtificialImportAliasedDescriptor: Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'ImportInsertHelper' @ [50:21] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [50:40] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'context' @ [50:52] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'project' @ [50:60] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'importDescriptor' @ [50:69] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'file' @ [50:86] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'descriptor' @ [50:92] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'callType' @ [53:22] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler[PropertyDescriptorImpl]

'DEFAULT' @ [53:43] ==> public object DEFAULT : CallType<Nothing?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'descriptor' @ [54:21] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'isArtificialImportAliasedDescriptor' @ [54:32] ==> public val DeclarationDescriptor.isArtificialImportAliasedDescriptor: Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'descriptor' @ [55:30] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'importableFqName' @ [55:41] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'context' @ [56:17] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'document' @ [56:25] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'replaceString' @ [56:34] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'context' @ [56:48] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'startOffset' @ [56:56] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [56:69] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'tailOffset' @ [56:77] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'fqName' @ [56:89] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'render' @ [56:96] ==> public fun FqName.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'psiDocumentManager' @ [58:17] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'commitAllDocuments' @ [58:36] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'ShortenReferences' @ [60:17] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [60:35] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [60:43] ==> public final fun process(file: KtFile, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'file' @ [60:51] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'context' @ [60:57] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'startOffset' @ [60:65] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [60:78] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'tailOffset' @ [60:86] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'psiDocumentManager' @ [62:17] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[LocalVariableDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [62:36] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [62:76] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'document' @ [62:84] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'context' @ [65:21] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'document' @ [65:29] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'isTextAt' @ [65:38] ==> public fun Document.isTextAt(offset: Int, text: String): Boolean defined in org.jetbrains.kotlin.idea.completion.handlers[SimpleFunctionDescriptorImpl]

'context' @ [65:47] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'tailOffset' @ [65:55] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'context' @ [66:21] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'document' @ [66:29] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'deleteString' @ [66:38] ==> public abstract fun deleteString(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'context' @ [66:51] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'tailOffset' @ [66:59] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'context' @ [66:75] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinCallableInsertHandler.addImport[ValueParameterDescriptorImpl]

'tailOffset' @ [66:83] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

