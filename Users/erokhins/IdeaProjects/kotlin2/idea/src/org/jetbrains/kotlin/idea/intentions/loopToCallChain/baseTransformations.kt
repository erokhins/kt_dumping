'PsiChildRange' @ [37:39] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'singleElement' @ [37:53] ==> public final fun singleElement(element: PsiElement): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[DeserializedSimpleFunctionDescriptor]

'loop' @ [37:67] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation[PropertyDescriptorImpl]

'unwrapIfLabeled' @ [37:72] ==> public fun KtExpression.unwrapIfLabeled(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'resultCallChain' @ [40:16] ==> value-parameter resultCallChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[ValueParameterDescriptorImpl]

'loop' @ [44:16] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation[PropertyDescriptorImpl]

'unwrapIfLabeled' @ [44:21] ==> public fun KtExpression.unwrapIfLabeled(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'replaced' @ [44:39] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'resultCallChain' @ [44:48] ==> value-parameter resultCallChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation.convertLoop[ValueParameterDescriptorImpl]

'PsiChildRange' @ [56:39] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'initialization' @ [56:53] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'initializationStatement' @ [56:68] ==> public final val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'loop' @ [56:93] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'unwrapIfLabeled' @ [56:98] ==> public fun KtExpression.unwrapIfLabeled(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [59:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'resultCallChain' @ [59:39] ==> value-parameter resultCallChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[ValueParameterDescriptorImpl]

'initialization' @ [60:39] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'initializationStatement' @ [60:54] ==> public final val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'if (initializationStatement is KtVariableDeclaration) {
            val resolutionScope = loop.getResolutionScope()

            fun isUniqueName(name: String): Boolean {
                val identifier = Name.identifier(name)
                return resolutionScope.findVariable(identifier, NoLookupLocation.FROM_IDE) == null
                       && resolutionScope.findFunction(identifier, NoLookupLocation.FROM_IDE) == null
                       && resolutionScope.findClassifier(identifier, NoLookupLocation.FROM_IDE) == null
                       && resolutionScope.findPackage(identifier) == null
            }
            val uniqueName = KotlinNameSuggester.suggestNameByName("test", ::isUniqueName)

            val copy = initializationStatement.copied()
            copy.initializer!!.replace(resultCallChain)
            copy.setName(uniqueName)
            copy
        }
        else {
            psiFactory.createExpressionByPattern("$0 = $1", initialization.variable.nameAsSafeName, resultCallChain)
        }' @ [61:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'initializationStatement' @ [61:20] ==> val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'loop' @ [62:35] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'getResolutionScope' @ [62:40] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'identifier' @ [65:39] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [65:50] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors.isUniqueName[ValueParameterDescriptorImpl]

'resolutionScope' @ [66:24] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'findVariable' @ [66:40] ==> public fun HierarchicalScope.findVariable(name: Name, location: LookupLocation, predicate: (VariableDescriptor) -> Boolean = ...): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [66:53] ==> val identifier: Name defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors.isUniqueName[LocalVariableDescriptor]

'FROM_IDE' @ [66:82] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'resolutionScope' @ [67:27] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'findFunction' @ [67:43] ==> public fun HierarchicalScope.findFunction(name: Name, location: LookupLocation, predicate: (FunctionDescriptor) -> Boolean = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [67:56] ==> val identifier: Name defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors.isUniqueName[LocalVariableDescriptor]

'FROM_IDE' @ [67:85] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'resolutionScope' @ [68:27] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'findClassifier' @ [68:43] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [68:58] ==> val identifier: Name defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors.isUniqueName[LocalVariableDescriptor]

'FROM_IDE' @ [68:87] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'resolutionScope' @ [69:27] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'findPackage' @ [69:43] ==> public fun HierarchicalScope.findPackage(name: Name): PackageViewDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [69:55] ==> val identifier: Name defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors.isUniqueName[LocalVariableDescriptor]

'KotlinNameSuggester' @ [71:30] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [71:50] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'isUniqueName' @ [71:78] ==> local final fun isUniqueName(name: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[SimpleFunctionDescriptorImpl]

'initializationStatement' @ [73:24] ==> val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'copied' @ [73:48] ==> public fun <T : PsiElement> KtVariableDeclaration.copied(): KtVariableDeclaration defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtVariableDeclaration

'copy' @ [74:13] ==> val copy: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'initializer' @ [74:18] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'replace' @ [74:32] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'resultCallChain' @ [74:40] ==> value-parameter resultCallChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[ValueParameterDescriptorImpl]

'copy' @ [75:13] ==> val copy: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'setName' @ [75:18] ==> public abstract fun setName(@NotNull p0: String): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtVariableDeclaration[JavaMethodDescriptor]

'uniqueName' @ [75:26] ==> val uniqueName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'copy' @ [76:13] ==> val copy: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'psiFactory' @ [79:13] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[LocalVariableDescriptor]

'createExpressionByPattern' @ [79:24] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'initialization' @ [79:61] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'variable' @ [79:76] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'nameAsSafeName' @ [79:85] ==> public final val KtProperty.nameAsSafeName: Name[MyPropertyDescriptor]

'resultCallChain' @ [79:101] ==> value-parameter resultCallChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.generateExpressionToReplaceLoopAndCheckErrors[ValueParameterDescriptorImpl]

'initialization' @ [84:9] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'initializer' @ [84:24] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'replace' @ [84:36] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'resultCallChain' @ [84:44] ==> value-parameter resultCallChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[ValueParameterDescriptorImpl]

'initialization' @ [86:24] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'variable' @ [86:39] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'variable' @ [87:13] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'isVar' @ [87:22] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'variable' @ [87:31] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'countWriteUsages' @ [87:40] ==> public fun KtVariableDeclaration.countWriteUsages(): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'variable' @ [87:62] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'countWriteUsages' @ [87:71] ==> public fun KtVariableDeclaration.countWriteUsages(inElement: KtElement): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'loop' @ [87:88] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'variable' @ [88:13] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'valOrVarKeyword' @ [88:22] ==> public final val KtProperty.valOrVarKeyword: PsiElement[MyPropertyDescriptor]

'replace' @ [88:38] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [88:46] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'variable' @ [88:59] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'createValKeyword' @ [88:69] ==> public final fun createValKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'loop' @ [91:29] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'unwrapIfLabeled' @ [91:34] ==> public fun KtExpression.unwrapIfLabeled(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'initialization' @ [94:39] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[PropertyDescriptorImpl]

'initializationStatement' @ [94:54] ==> public final val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'initializationStatement' @ [95:13] ==> var initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'nextStatement' @ [95:37] ==> public fun KtExpression.nextStatement(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'loopUnwrapped' @ [95:56] ==> val loopUnwrapped: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'loopUnwrapped' @ [96:25] ==> val loopUnwrapped: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'parent' @ [96:39] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'assert' @ [97:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'block' @ [97:20] ==> val block: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'block' @ [98:48] ==> val block: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'addBefore' @ [98:54] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'initializationStatement' @ [98:64] ==> var initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'loopUnwrapped' @ [98:89] ==> val loopUnwrapped: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'block' @ [99:13] ==> val block: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'addBefore' @ [99:19] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [99:29] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'block' @ [99:42] ==> val block: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'createNewLine' @ [99:49] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'loopUnwrapped' @ [99:66] ==> val loopUnwrapped: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'commentSavingRangeHolder' @ [101:13] ==> value-parameter commentSavingRangeHolder: CommentSavingRangeHolder defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[ValueParameterDescriptorImpl]

'remove' @ [101:38] ==> public final fun remove(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.CommentSavingRangeHolder[SimpleFunctionDescriptorImpl]

'initializationStatement' @ [101:45] ==> var initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'initializationStatement' @ [103:13] ==> var initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'delete' @ [103:37] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'initializationStatement' @ [104:13] ==> var initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'movedInitializationStatement' @ [104:39] ==> val movedInitializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'loopUnwrapped' @ [107:9] ==> val loopUnwrapped: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'delete' @ [107:23] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'initializationStatement' @ [109:16] ==> var initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.convertLoop[LocalVariableDescriptor]

'AssignToVariableResultTransformation' @ [114:28] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'delegate' @ [114:65] ==> value-parameter delegate: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion.createDelegated[ValueParameterDescriptorImpl]

'loop' @ [114:74] ==> public abstract val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[PropertyDescriptorImpl]

'initialization' @ [114:80] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion.createDelegated[ValueParameterDescriptorImpl]

'delegate' @ [116:29] ==> value-parameter delegate: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion.createDelegated[ValueParameterDescriptorImpl]

'presentation' @ [116:38] ==> public abstract val presentation: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[PropertyDescriptorImpl]

'delegate' @ [119:28] ==> value-parameter delegate: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion.createDelegated[ValueParameterDescriptorImpl]

'generateCode' @ [119:37] ==> public abstract fun generateCode(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [119:50] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion.createDelegated.<no name provided>.generateCode[ValueParameterDescriptorImpl]

'delegate' @ [123:29] ==> value-parameter delegate: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion.createDelegated[ValueParameterDescriptorImpl]

'lazyMakesSense' @ [123:38] ==> public open val lazyMakesSense: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[PropertyDescriptorImpl]

'AssignToVariableResultTransformation' @ [135:5] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'sequenceTransformation' @ [135:42] ==> value-parameter sequenceTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignSequenceResultTransformation.<init>[ValueParameterDescriptorImpl]

'loop' @ [135:65] ==> public abstract val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.SequenceTransformation[PropertyDescriptorImpl]

'initialization' @ [135:71] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignSequenceResultTransformation.<init>[ValueParameterDescriptorImpl]

'sequenceTransformation' @ [138:17] ==> private final val sequenceTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignSequenceResultTransformation[PropertyDescriptorImpl]

'presentation' @ [138:40] ==> public abstract val presentation: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.SequenceTransformation[PropertyDescriptorImpl]

'sequenceTransformation' @ [141:16] ==> private final val sequenceTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignSequenceResultTransformation[PropertyDescriptorImpl]

'buildPresentation' @ [141:39] ==> public open fun buildPresentation(prevTransformationsPresentation: String?): String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.SequenceTransformation[SimpleFunctionDescriptorImpl]

'prevTransformationsPresentation' @ [141:57] ==> value-parameter prevTransformationsPresentation: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignSequenceResultTransformation.buildPresentation[ValueParameterDescriptorImpl]

'sequenceTransformation' @ [145:16] ==> private final val sequenceTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignSequenceResultTransformation[PropertyDescriptorImpl]

'generateCode' @ [145:39] ==> public abstract fun generateCode(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.SequenceTransformation[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [145:52] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignSequenceResultTransformation.generateCode[ValueParameterDescriptorImpl]

