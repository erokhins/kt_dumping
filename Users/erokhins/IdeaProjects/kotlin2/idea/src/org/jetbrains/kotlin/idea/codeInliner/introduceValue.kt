'assert' @ [60:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'usages' @ [60:12] ==> value-parameter usages: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'all' @ [60:19] ==> public inline fun <T> Iterable<KtExpression>.all(predicate: (KtExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'this' @ [60:25] ==> <this> defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ReceiverParameterDescriptorImpl]

'containsStrictlyInside' @ [60:30] ==> public final fun containsStrictlyInside(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[SimpleFunctionDescriptorImpl]

'it' @ [60:53] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.<anonymous>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [62:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'value' @ [62:35] ==> value-parameter value: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'expressionToBeReplaced' @ [64:26] ==> value-parameter expressionToBeReplaced: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'analyze' @ [64:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [64:73] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'psiFactory' @ [67:26] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'createExpression' @ [67:37] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'name' @ [67:54] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.replaceUsages[ValueParameterDescriptorImpl]

'render' @ [67:59] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'usages' @ [68:23] ==> value-parameter usages: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'?:' @ [70:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'usage' @ [70:35] ==> val usage: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.replaceUsages[LocalVariableDescriptor]

'parent' @ [70:41] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'usage' @ [70:82] ==> val usage: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.replaceUsages[LocalVariableDescriptor]

'usageToReplace' @ [71:13] ==> val usageToReplace: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.replaceUsages[LocalVariableDescriptor]

'replace' @ [71:28] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'nameInCode' @ [71:36] ==> val nameInCode: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.replaceUsages[LocalVariableDescriptor]

'if (nameSuggestion != null)
            KotlinNameSuggester.suggestNameByName(nameSuggestion, validator)
        else
            KotlinNameSuggester.suggestNamesByExpressionOnly(value, bindingContext, validator, "t").first()' @ [76:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'nameSuggestion' @ [76:24] ==> value-parameter nameSuggestion: String? = ... defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'suggestNameByName' @ [77:33] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'nameSuggestion' @ [77:51] ==> value-parameter nameSuggestion: String? = ... defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'validator' @ [77:67] ==> value-parameter validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.suggestName[ValueParameterDescriptorImpl]

'suggestNamesByExpressionOnly' @ [79:33] ==> public final fun suggestNamesByExpressionOnly(expression: KtExpression, bindingContext: BindingContext?, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'value' @ [79:62] ==> value-parameter value: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'bindingContext' @ [79:69] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'validator' @ [79:85] ==> value-parameter validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.suggestName[ValueParameterDescriptorImpl]

'first' @ [79:101] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'identifier' @ [80:21] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [80:32] ==> val name: String defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.suggestName[LocalVariableDescriptor]

'collectNameUsages' @ [84:36] ==> private fun collectNameUsages(scope: MutableCodeToInline, name: String): List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.codeInliner in file introduceValue.kt[SimpleFunctionDescriptorImpl]

'this' @ [84:54] ==> <this> defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ReceiverParameterDescriptorImpl]

'name' @ [84:60] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.isNameUsed[ValueParameterDescriptorImpl]

'any' @ [84:66] ==> public inline fun <T> Iterable<KtSimpleNameExpression>.any(predicate: (KtSimpleNameExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression

'usages' @ [84:85] ==> value-parameter usages: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'none' @ [84:92] ==> public inline fun <T> Iterable<KtExpression>.none(predicate: (KtExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [84:99] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.isNameUsed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [84:102] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'nameUsage' @ [84:113] ==> value-parameter nameUsage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.isNameUsed.<anonymous>[ValueParameterDescriptorImpl]

'if (!safeCall) {
        if (usages.isNotEmpty()) {
            val resolutionScope = expressionToBeReplaced.getResolutionScope(bindingContext, expressionToBeReplaced.getResolutionFacade())

            val name = suggestName { name -> !name.nameHasConflictsInScope(resolutionScope) && !isNameUsed(name) }

            val declaration = psiFactory.createDeclarationByPattern<KtVariableDeclaration>("val $0 = $1", name, value)
            statementsBefore.add(0, declaration)

            val explicitType = valueType?.takeIf {
                variableNeedsExplicitType(value, valueType, expressionToBeReplaced, resolutionScope, bindingContext)
            }
            if (explicitType != null) {
                addPostInsertionAction(declaration) { it.setType(explicitType) }
            }

            replaceUsages(name)
        }
        else {
            statementsBefore.add(0, value)
        }
    }
    else {
        val useIt = !isNameUsed("it")
        val name = if (useIt) Name.identifier("it") else suggestName { !isNameUsed(it) }
        replaceUsages(name)

        mainExpression = psiFactory.buildExpression {
            appendExpression(value)
            appendFixedText("?.let{")

            if (!useIt) {
                appendName(name)
                appendFixedText("->")
            }

            for (statement in statementsBefore) {
                appendExpression(statement)
                appendFixedText("\n")
            }

            if (mainExpression != null) {
                appendExpression(mainExpression)
            }

            appendFixedText("}")
        }
        statementsBefore.clear()
    }' @ [86:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [86:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'safeCall' @ [86:10] ==> value-parameter safeCall: Boolean = ... defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'if (usages.isNotEmpty()) {
            val resolutionScope = expressionToBeReplaced.getResolutionScope(bindingContext, expressionToBeReplaced.getResolutionFacade())

            val name = suggestName { name -> !name.nameHasConflictsInScope(resolutionScope) && !isNameUsed(name) }

            val declaration = psiFactory.createDeclarationByPattern<KtVariableDeclaration>("val $0 = $1", name, value)
            statementsBefore.add(0, declaration)

            val explicitType = valueType?.takeIf {
                variableNeedsExplicitType(value, valueType, expressionToBeReplaced, resolutionScope, bindingContext)
            }
            if (explicitType != null) {
                addPostInsertionAction(declaration) { it.setType(explicitType) }
            }

            replaceUsages(name)
        }
        else {
            statementsBefore.add(0, value)
        }' @ [87:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'usages' @ [87:13] ==> value-parameter usages: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'isNotEmpty' @ [87:20] ==> @InlineOnly public inline fun <T> Collection<KtExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'expressionToBeReplaced' @ [88:35] ==> value-parameter expressionToBeReplaced: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'getResolutionScope' @ [88:58] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [88:77] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'expressionToBeReplaced' @ [88:93] ==> value-parameter expressionToBeReplaced: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [88:116] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'suggestName' @ [90:24] ==> local final fun suggestName(validator: (String) -> Boolean): Name defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[SimpleFunctionDescriptorImpl]

'!' @ [90:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [90:47] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.<anonymous>[ValueParameterDescriptorImpl]

'nameHasConflictsInScope' @ [90:52] ==> public fun String.nameHasConflictsInScope(lexicalScope: LexicalScope): Boolean defined in org.jetbrains.kotlin.idea.codeInliner in file introduceValue.kt[SimpleFunctionDescriptorImpl]

'resolutionScope' @ [90:76] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'!' @ [90:96] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNameUsed' @ [90:97] ==> local final fun isNameUsed(name: String): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[SimpleFunctionDescriptorImpl]

'name' @ [90:108] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.<anonymous>[ValueParameterDescriptorImpl]

'psiFactory' @ [92:31] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'createDeclarationByPattern' @ [92:42] ==> public fun <TDeclaration : KtDeclaration> KtPsiFactory.createDeclarationByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtVariableDeclaration defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtVariableDeclaration

'name' @ [92:107] ==> val name: Name defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'value' @ [92:113] ==> value-parameter value: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'statementsBefore' @ [93:13] ==> public final val statementsBefore: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'add' @ [93:30] ==> public abstract fun add(index: Int, element: KtExpression): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'declaration' @ [93:37] ==> val declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'valueType' @ [95:32] ==> value-parameter valueType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'takeIf' @ [95:43] ==> @InlineOnly @SinceKotlin public inline fun <T> KotlinType.takeIf(predicate: (KotlinType) -> Boolean): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'variableNeedsExplicitType' @ [96:17] ==> private fun variableNeedsExplicitType(initializer: KtExpression, initializerType: KotlinType, context: KtExpression, resolutionScope: LexicalScope, bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.codeInliner in file introduceValue.kt[SimpleFunctionDescriptorImpl]

'value' @ [96:43] ==> value-parameter value: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'valueType' @ [96:50] ==> value-parameter valueType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'expressionToBeReplaced' @ [96:61] ==> value-parameter expressionToBeReplaced: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'resolutionScope' @ [96:85] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'bindingContext' @ [96:102] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'explicitType' @ [98:17] ==> val explicitType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'addPostInsertionAction' @ [99:17] ==> public final fun <TElement : KtElement> addPostInsertionAction(element: KtVariableDeclaration, action: (KtVariableDeclaration) -> Unit): Unit defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtVariableDeclaration

'declaration' @ [99:40] ==> val declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'it' @ [99:55] ==> value-parameter it: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.<anonymous>[ValueParameterDescriptorImpl]

'setType' @ [99:58] ==> public fun KtCallableDeclaration.setType(type: KotlinType, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'explicitType' @ [99:66] ==> val explicitType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'replaceUsages' @ [102:13] ==> local final fun replaceUsages(name: Name): Unit defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[SimpleFunctionDescriptorImpl]

'name' @ [102:27] ==> val name: Name defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'statementsBefore' @ [105:13] ==> public final val statementsBefore: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'add' @ [105:30] ==> public abstract fun add(index: Int, element: KtExpression): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'value' @ [105:37] ==> value-parameter value: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'!' @ [109:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNameUsed' @ [109:22] ==> local final fun isNameUsed(name: String): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[SimpleFunctionDescriptorImpl]

'if (useIt) Name.identifier("it") else suggestName { !isNameUsed(it) }' @ [110:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name, elseBranch: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name

'useIt' @ [110:24] ==> val useIt: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'identifier' @ [110:36] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'suggestName' @ [110:58] ==> local final fun suggestName(validator: (String) -> Boolean): Name defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[SimpleFunctionDescriptorImpl]

'!' @ [110:72] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNameUsed' @ [110:73] ==> local final fun isNameUsed(name: String): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[SimpleFunctionDescriptorImpl]

'it' @ [110:84] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.<anonymous>[ValueParameterDescriptorImpl]

'replaceUsages' @ [111:9] ==> local final fun replaceUsages(name: Name): Unit defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[SimpleFunctionDescriptorImpl]

'name' @ [111:23] ==> val name: Name defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'mainExpression' @ [113:9] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'psiFactory' @ [113:26] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'buildExpression' @ [113:37] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [114:13] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'value' @ [114:30] ==> value-parameter value: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[ValueParameterDescriptorImpl]

'appendFixedText' @ [115:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'!' @ [117:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'useIt' @ [117:18] ==> val useIt: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'appendName' @ [118:17] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'name' @ [118:28] ==> val name: Name defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue[LocalVariableDescriptor]

'appendFixedText' @ [119:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'statementsBefore' @ [122:31] ==> public final val statementsBefore: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'appendExpression' @ [123:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'statement' @ [123:34] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.introduceValue.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [124:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'mainExpression' @ [127:17] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'appendExpression' @ [128:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'mainExpression' @ [128:34] ==> public final var mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'appendFixedText' @ [131:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'statementsBefore' @ [133:9] ==> public final val statementsBefore: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'clear' @ [133:26] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'lexicalScope' @ [137:66] ==> value-parameter lexicalScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.nameHasConflictsInScope[ValueParameterDescriptorImpl]

'getAllAccessibleVariables' @ [137:79] ==> public fun LexicalScope.getAllAccessibleVariables(name: Name): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'identifier' @ [137:110] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'this' @ [137:121] ==> <this> defined in org.jetbrains.kotlin.idea.codeInliner.nameHasConflictsInScope[ReceiverParameterDescriptorImpl]

'any' @ [137:128] ==> public inline fun <T> Iterable<VariableDescriptor>.any(predicate: (VariableDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'!' @ [138:5] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [138:6] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.nameHasConflictsInScope.<anonymous>[ValueParameterDescriptorImpl]

'isExtension' @ [138:9] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'it' @ [138:24] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.nameHasConflictsInScope.<anonymous>[ValueParameterDescriptorImpl]

'isVisible' @ [138:27] ==> public fun DeclarationDescriptorWithVisibility.isVisible(from: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'lexicalScope' @ [138:37] ==> value-parameter lexicalScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.nameHasConflictsInScope[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [138:50] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'containsErrorType' @ [148:20] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'initializerType' @ [148:38] ==> value-parameter initializerType: KotlinType defined in org.jetbrains.kotlin.idea.codeInliner.variableNeedsExplicitType[ValueParameterDescriptorImpl]

'initializer' @ [149:40] ==> value-parameter initializer: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.variableNeedsExplicitType[ValueParameterDescriptorImpl]

'computeTypeInContext' @ [149:52] ==> @JvmOverloads public fun KtExpression.computeTypeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ...): KotlinType? defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'resolutionScope' @ [150:13] ==> value-parameter resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.variableNeedsExplicitType[ValueParameterDescriptorImpl]

'context' @ [151:13] ==> value-parameter context: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.variableNeedsExplicitType[ValueParameterDescriptorImpl]

'bindingContext' @ [152:28] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.variableNeedsExplicitType[ValueParameterDescriptorImpl]

'getDataFlowInfoBefore' @ [152:43] ==> public fun BindingContext.getDataFlowInfoBefore(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [152:65] ==> value-parameter context: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.variableNeedsExplicitType[ValueParameterDescriptorImpl]

'valueTypeWithoutExpectedType' @ [154:12] ==> val valueTypeWithoutExpectedType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.variableNeedsExplicitType[LocalVariableDescriptor]

'containsErrorType' @ [154:63] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'valueTypeWithoutExpectedType' @ [154:81] ==> val valueTypeWithoutExpectedType: KotlinType? defined in org.jetbrains.kotlin.idea.codeInliner.variableNeedsExplicitType[LocalVariableDescriptor]

'scope' @ [158:12] ==> value-parameter scope: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.collectNameUsages[ValueParameterDescriptorImpl]

'expressions' @ [158:18] ==> public final val expressions: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'flatMap' @ [158:30] ==> public inline fun <T, R> Iterable<KtExpression>.flatMap(transform: (KtExpression) -> Iterable<KtSimpleNameExpression>): List<KtSimpleNameExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtSimpleNameExpression

'expression' @ [159:9] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.collectNameUsages.<anonymous>[ValueParameterDescriptorImpl]

'collectDescendantsOfType' @ [159:20] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtSimpleNameExpression) -> Boolean = ...): List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'it' @ [159:71] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.collectNameUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getReceiverExpression' @ [159:74] ==> public fun KtSimpleNameExpression.getReceiverExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [159:109] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.collectNameUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedName' @ [159:112] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'name' @ [159:135] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.codeInliner.collectNameUsages[ValueParameterDescriptorImpl]

