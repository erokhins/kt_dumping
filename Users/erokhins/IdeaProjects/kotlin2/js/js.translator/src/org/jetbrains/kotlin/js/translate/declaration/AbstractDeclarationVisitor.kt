'TranslatorVisitor<Unit>' @ [34:45] ==> public constructor TranslatorVisitor<T : (Any..Any?)>() defined in org.jetbrains.kotlin.js.translate.general.TranslatorVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'ClassTranslator' @ [41:9] ==> public companion object defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[FakeCallableDescriptorForObject]

'translate' @ [41:25] ==> @JvmStatic public final fun translate(classDeclaration: KtClassOrObject, context: TranslationContext, enumInitializerName: JsName?): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.Companion[SimpleFunctionDescriptorImpl]

'classOrObject' @ [41:35] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject[ValueParameterDescriptorImpl]

'context' @ [41:50] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject[ValueParameterDescriptorImpl]

'enumInitializerName' @ [41:59] ==> public open val enumInitializerName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[PropertyDescriptorImpl]

'getClassDescriptor' @ [42:39] ==> @NotNull public open fun getClassDescriptor(@NotNull context: BindingContext, @NotNull declaration: KtClassOrObject): ClassDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [42:58] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject[ValueParameterDescriptorImpl]

'bindingContext' @ [42:66] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classOrObject' @ [42:84] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject[ValueParameterDescriptorImpl]

'context' @ [43:9] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject[ValueParameterDescriptorImpl]

'export' @ [43:17] ==> public open fun export(@NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [43:24] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject[LocalVariableDescriptor]

'getPropertyDescriptor' @ [47:39] ==> @NotNull public open fun getPropertyDescriptor(@NotNull context: BindingContext, @NotNull declaration: KtProperty): PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [47:61] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'bindingContext' @ [47:69] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'expression' @ [47:87] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'descriptor' @ [48:13] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'modality' @ [48:24] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [48:37] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [48:46] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'context' @ [50:31] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'newDeclaration' @ [50:39] ==> @NotNull public open fun newDeclaration(@NotNull descriptor: DeclarationDescriptor): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [50:54] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'DefaultPropertyTranslator' @ [52:33] ==> public constructor DefaultPropertyTranslator(descriptor: VariableDescriptorWithAccessors, context: TranslationContext, delegateReference: JsExpression) defined in org.jetbrains.kotlin.js.translate.declaration.DefaultPropertyTranslator[ClassConstructorDescriptorImpl]

'descriptor' @ [52:59] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'context' @ [52:71] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'getBackingFieldReference' @ [52:80] ==> protected abstract fun getBackingFieldReference(descriptor: PropertyDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[SimpleFunctionDescriptorImpl]

'descriptor' @ [52:105] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'descriptor' @ [53:22] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'getter' @ [53:33] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'if (expression.hasCustomGetter()) {
            translateFunction(getter, expression.getter!!, propertyContext)
        }
        else {
            val function = context.getFunctionObject(getter)
            function.source = expression
            defaultTranslator.generateDefaultGetterFunction(getter, function)
            function
        }' @ [54:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'expression' @ [54:30] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'hasCustomGetter' @ [54:41] ==> public fun KtProperty.hasCustomGetter(): Boolean defined in org.jetbrains.kotlin.js.translate.declaration in file PropertyTranslator.kt[SimpleFunctionDescriptorImpl]

'translateFunction' @ [55:13] ==> private final fun translateFunction(descriptor: FunctionDescriptor, expression: KtDeclarationWithBody, context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[SimpleFunctionDescriptorImpl]

'getter' @ [55:31] ==> val getter: PropertyGetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'expression' @ [55:39] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'getter' @ [55:50] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'propertyContext' @ [55:60] ==> val propertyContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'context' @ [58:28] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'getFunctionObject' @ [58:36] ==> @NotNull public open fun getFunctionObject(@NotNull descriptor: CallableDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getter' @ [58:54] ==> val getter: PropertyGetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'function' @ [59:13] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'source' @ [59:22] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [59:31] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'defaultTranslator' @ [60:13] ==> val defaultTranslator: DefaultPropertyTranslator defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'generateDefaultGetterFunction' @ [60:31] ==> public final fun generateDefaultGetterFunction(getterDescriptor: VariableAccessorDescriptor, function: JsFunction): Unit defined in org.jetbrains.kotlin.js.translate.declaration.DefaultPropertyTranslator[SimpleFunctionDescriptorImpl]

'getter' @ [60:61] ==> val getter: PropertyGetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'function' @ [60:69] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'function' @ [61:13] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'if (descriptor.isVar) {
            val setter = descriptor.setter!!
            if (expression.hasCustomSetter()) {
                translateFunction(setter, expression.setter!!, propertyContext)
            }
            else {
                val function = context.getFunctionObject(setter)
                function.source = expression
                defaultTranslator.generateDefaultSetterFunction(setter, function)
                function
            }
        }
        else {
            null
        }' @ [64:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'descriptor' @ [64:30] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'isVar' @ [64:41] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'descriptor' @ [65:26] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'setter' @ [65:37] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'if (expression.hasCustomSetter()) {
                translateFunction(setter, expression.setter!!, propertyContext)
            }
            else {
                val function = context.getFunctionObject(setter)
                function.source = expression
                defaultTranslator.generateDefaultSetterFunction(setter, function)
                function
            }' @ [66:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'expression' @ [66:17] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'hasCustomSetter' @ [66:28] ==> public fun KtProperty.hasCustomSetter(): Boolean defined in org.jetbrains.kotlin.js.translate.declaration in file PropertyTranslator.kt[SimpleFunctionDescriptorImpl]

'translateFunction' @ [67:17] ==> private final fun translateFunction(descriptor: FunctionDescriptor, expression: KtDeclarationWithBody, context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[SimpleFunctionDescriptorImpl]

'setter' @ [67:35] ==> val setter: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'expression' @ [67:43] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'setter' @ [67:54] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'propertyContext' @ [67:64] ==> val propertyContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'context' @ [70:32] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'getFunctionObject' @ [70:40] ==> @NotNull public open fun getFunctionObject(@NotNull descriptor: CallableDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'setter' @ [70:58] ==> val setter: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'function' @ [71:17] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'source' @ [71:26] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [71:35] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'defaultTranslator' @ [72:17] ==> val defaultTranslator: DefaultPropertyTranslator defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'generateDefaultSetterFunction' @ [72:35] ==> public final fun generateDefaultSetterFunction(setterDescriptor: VariableAccessorDescriptor, function: JsFunction): Unit defined in org.jetbrains.kotlin.js.translate.declaration.DefaultPropertyTranslator[SimpleFunctionDescriptorImpl]

'setter' @ [72:65] ==> val setter: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'function' @ [72:73] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'function' @ [73:17] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'if (TranslationUtils.shouldAccessViaFunctions(descriptor) || descriptor.isExtensionProperty) {
            addFunction(descriptor.getter!!, getterExpr, expression.getter ?: expression)
            descriptor.setter?.let { addFunction(it, setterExpr!!, expression.setter ?: expression) }
        }
        else {
            addProperty(descriptor, getterExpr, setterExpr)
        }' @ [80:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'shouldAccessViaFunctions' @ [80:30] ==> public open fun shouldAccessViaFunctions(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'descriptor' @ [80:55] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'descriptor' @ [80:70] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'isExtensionProperty' @ [80:81] ==> public val DeclarationDescriptor.isExtensionProperty: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'addFunction' @ [81:13] ==> protected abstract fun addFunction(descriptor: FunctionDescriptor, expression: JsExpression?, psi: KtElement): Unit defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[SimpleFunctionDescriptorImpl]

'descriptor' @ [81:25] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'getter' @ [81:36] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getterExpr' @ [81:46] ==> val getterExpr: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'expression' @ [81:58] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'getter' @ [81:69] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'expression' @ [81:79] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'descriptor' @ [82:13] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'setter' @ [82:24] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [82:32] ==> @InlineOnly public inline fun <T, R> PropertySetterDescriptor.let(block: (PropertySetterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptor
    <R> -> Unit

'addFunction' @ [82:38] ==> protected abstract fun addFunction(descriptor: FunctionDescriptor, expression: JsExpression?, psi: KtElement): Unit defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[SimpleFunctionDescriptorImpl]

'it' @ [82:50] ==> value-parameter it: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty.<anonymous>[ValueParameterDescriptorImpl]

'setterExpr' @ [82:54] ==> val setterExpr: JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'expression' @ [82:68] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'setter' @ [82:79] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'expression' @ [82:89] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'addProperty' @ [85:13] ==> protected abstract fun addProperty(descriptor: PropertyDescriptor, getter: JsExpression, setter: JsExpression?): Unit defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[SimpleFunctionDescriptorImpl]

'descriptor' @ [85:25] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'getterExpr' @ [85:37] ==> val getterExpr: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'setterExpr' @ [85:49] ==> val setterExpr: JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'getFunctionDescriptor' @ [90:39] ==> @NotNull public open fun getFunctionDescriptor(@NotNull context: BindingContext, @NotNull declaration: KtDeclarationWithBody): FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [90:61] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'bindingContext' @ [90:69] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'expression' @ [90:87] ==> value-parameter expression: KtNamedFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'if (descriptor.modality != Modality.ABSTRACT) translateFunction(descriptor, expression, context) else null' @ [91:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'descriptor' @ [91:30] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitNamedFunction[LocalVariableDescriptor]

'modality' @ [91:41] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [91:62] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'translateFunction' @ [91:72] ==> private final fun translateFunction(descriptor: FunctionDescriptor, expression: KtDeclarationWithBody, context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[SimpleFunctionDescriptorImpl]

'descriptor' @ [91:90] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitNamedFunction[LocalVariableDescriptor]

'expression' @ [91:102] ==> value-parameter expression: KtNamedFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'context' @ [91:114] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'addFunction' @ [92:9] ==> protected abstract fun addFunction(descriptor: FunctionDescriptor, expression: JsExpression?, psi: KtElement): Unit defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[SimpleFunctionDescriptorImpl]

'descriptor' @ [92:21] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitNamedFunction[LocalVariableDescriptor]

'jsFunction' @ [92:33] ==> val jsFunction: JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitNamedFunction[LocalVariableDescriptor]

'expression' @ [92:45] ==> value-parameter expression: KtNamedFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'context' @ [102:24] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'getFunctionObject' @ [102:32] ==> @NotNull public open fun getFunctionObject(@NotNull descriptor: CallableDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [102:50] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'function' @ [103:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[LocalVariableDescriptor]

'source' @ [103:18] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [103:27] ==> value-parameter expression: KtDeclarationWithBody defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'finalElement' @ [103:38] ==> public val PsiElement.finalElement: PsiElement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[PropertyDescriptorImpl]

'context' @ [104:28] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'newDeclaration' @ [104:36] ==> @NotNull public open fun newDeclaration(@NotNull descriptor: DeclarationDescriptor): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [104:51] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'translateAndAliasParameters' @ [104:63] ==> public fun TranslationContext.translateAndAliasParameters(descriptor: FunctionDescriptor, targetList: MutableList<JsParameter>): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression in file FunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [104:91] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'function' @ [104:103] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[LocalVariableDescriptor]

'parameters' @ [104:112] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'descriptor' @ [106:13] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'isSuspend' @ [106:24] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'descriptor' @ [107:17] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'requiresStateMachineTransformation' @ [107:28] ==> public fun FunctionDescriptor.requiresStateMachineTransformation(context: TranslationContext): Boolean defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'context' @ [107:63] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'function' @ [108:17] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[LocalVariableDescriptor]

'fillCoroutineMetadata' @ [108:26] ==> public fun JsFunction.fillCoroutineMetadata(context: TranslationContext, descriptor: FunctionDescriptor, hasController: Boolean): Unit defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'context' @ [108:48] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'descriptor' @ [108:57] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'!' @ [112:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [112:14] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'isOverridable' @ [112:25] ==> public val CallableMemberDescriptor.isOverridable: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'function' @ [113:13] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[LocalVariableDescriptor]

'body' @ [113:22] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [113:27] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'setDefaultValueForArguments' @ [113:64] ==> @NotNull public open fun setDefaultValueForArguments(@NotNull descriptor: FunctionDescriptor, @NotNull functionBodyContext: TranslationContext): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.translate.utils.FunctionBodyTranslator[JavaMethodDescriptor]

'descriptor' @ [113:92] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'innerContext' @ [113:104] ==> val innerContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[LocalVariableDescriptor]

'innerContext' @ [115:9] ==> val innerContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[LocalVariableDescriptor]

'translateFunction' @ [115:22] ==> public fun TranslationContext.translateFunction(declaration: KtDeclarationWithBody, function: JsFunction): Unit defined in org.jetbrains.kotlin.js.translate.expression in file FunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [115:40] ==> value-parameter expression: KtDeclarationWithBody defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'function' @ [115:52] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[LocalVariableDescriptor]

'innerContext' @ [116:16] ==> val innerContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[LocalVariableDescriptor]

'wrapWithInlineMetadata' @ [116:29] ==> public fun TranslationContext.wrapWithInlineMetadata(function: JsFunction, descriptor: FunctionDescriptor, config: JsConfig): JsExpression defined in org.jetbrains.kotlin.js.translate.expression in file FunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'function' @ [116:52] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[LocalVariableDescriptor]

'descriptor' @ [116:62] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'context' @ [116:74] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.translateFunction[ValueParameterDescriptorImpl]

'config' @ [116:82] ==> public final val TranslationContext.config: JsConfig[MyPropertyDescriptor]

