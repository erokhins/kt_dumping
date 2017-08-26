'AbstractDeclarationVisitor' @ [31:73] ==> public constructor AbstractDeclarationVisitor() defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[ClassConstructorDescriptorImpl]

'getPropertyDescriptor' @ [33:47] ==> @NotNull public open fun getPropertyDescriptor(@NotNull context: BindingContext, @NotNull declaration: KtProperty): PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [33:69] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'bindingContext' @ [33:77] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'expression' @ [33:95] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'context' @ [35:25] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'getInnerNameForDescriptor' @ [35:33] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'propertyDescriptor' @ [35:59] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'context' @ [36:36] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'bindingContext' @ [36:44] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'BACKING_FIELD_REQUIRED' @ [36:76] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'propertyDescriptor' @ [36:100] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'backingFieldRequired' @ [37:13] ==> val backingFieldRequired: Boolean defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'expression' @ [37:37] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'delegateExpression' @ [37:48] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'context' @ [38:31] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'translateDelegateOrInitializerExpression' @ [38:39] ==> public fun TranslationContext.translateDelegateOrInitializerExpression(expression: KtProperty): JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration in file PropertyTranslator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [38:80] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'context' @ [39:13] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'addDeclarationStatement' @ [39:21] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'newVar' @ [39:56] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'innerName' @ [39:63] ==> val innerName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'initializer' @ [40:17] ==> val initializer: JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'context' @ [41:17] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'addTopLevelStatement' @ [41:25] ==> public open fun addTopLevelStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'assignment' @ [41:57] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'innerName' @ [41:68] ==> val innerName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'makeRef' @ [41:78] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'initializer' @ [41:89] ==> val initializer: JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[LocalVariableDescriptor]

'makeStmt' @ [41:102] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'super' @ [45:9] ==> <this> defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[LazyClassReceiverParameterDescriptor]

'visitProperty' @ [45:15] ==> public open fun visitProperty(expression: KtProperty, context: TranslationContext): Unit defined in org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [45:29] ==> value-parameter expression: KtProperty defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'context' @ [45:41] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.visitProperty[ValueParameterDescriptorImpl]

'expression' @ [49:13] ==> value-parameter expression: JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunction[ValueParameterDescriptorImpl]

'addFunctionButNotExport' @ [50:9] ==> private final fun addFunctionButNotExport(descriptor: FunctionDescriptor, expression: JsExpression): JsName defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[SimpleFunctionDescriptorImpl]

'descriptor' @ [50:33] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunction[ValueParameterDescriptorImpl]

'expression' @ [50:45] ==> value-parameter expression: JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunction[ValueParameterDescriptorImpl]

'context' @ [51:9] ==> private final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[PropertyDescriptorImpl]

'export' @ [51:17] ==> public open fun export(@NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [51:24] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunction[ValueParameterDescriptorImpl]

'!' @ [55:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSimpleFinalProperty' @ [55:32] ==> public open fun isSimpleFinalProperty(@NotNull propertyDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [55:54] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addProperty[ValueParameterDescriptorImpl]

'addFunctionButNotExport' @ [56:13] ==> private final fun addFunctionButNotExport(descriptor: FunctionDescriptor, expression: JsExpression): JsName defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[SimpleFunctionDescriptorImpl]

'descriptor' @ [56:37] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addProperty[ValueParameterDescriptorImpl]

'getter' @ [56:48] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getter' @ [56:58] ==> value-parameter getter: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addProperty[ValueParameterDescriptorImpl]

'setter' @ [57:17] ==> value-parameter setter: JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addProperty[ValueParameterDescriptorImpl]

'addFunctionButNotExport' @ [58:17] ==> private final fun addFunctionButNotExport(descriptor: FunctionDescriptor, expression: JsExpression): JsName defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[SimpleFunctionDescriptorImpl]

'descriptor' @ [58:41] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addProperty[ValueParameterDescriptorImpl]

'setter' @ [58:52] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'setter' @ [58:62] ==> value-parameter setter: JsExpression? defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addProperty[ValueParameterDescriptorImpl]

'context' @ [61:9] ==> private final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[PropertyDescriptorImpl]

'export' @ [61:17] ==> public open fun export(@NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [61:24] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addProperty[ValueParameterDescriptorImpl]

'context' @ [65:16] ==> private final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[PropertyDescriptorImpl]

'getInnerReference' @ [65:24] ==> @NotNull public open fun getInnerReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [65:42] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.getBackingFieldReference[ValueParameterDescriptorImpl]

'context' @ [69:20] ==> private final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [69:28] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [69:54] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunctionButNotExport[ValueParameterDescriptorImpl]

'when (expression) {
            is JsFunction -> {
                expression.name = name
                context.addDeclarationStatement(expression.makeStmt())
            }
            else -> {
                context.addDeclarationStatement(JsAstUtils.newVar(name, expression))
            }
        }' @ [70:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'expression' @ [70:15] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunctionButNotExport[ValueParameterDescriptorImpl]

'expression' @ [72:17] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunctionButNotExport[ValueParameterDescriptorImpl]

'name' @ [72:28] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'name' @ [72:35] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunctionButNotExport[LocalVariableDescriptor]

'context' @ [73:17] ==> private final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[PropertyDescriptorImpl]

'addDeclarationStatement' @ [73:25] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'expression' @ [73:49] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunctionButNotExport[ValueParameterDescriptorImpl]

'makeStmt' @ [73:60] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'context' @ [76:17] ==> private final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor[PropertyDescriptorImpl]

'addDeclarationStatement' @ [76:25] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'newVar' @ [76:60] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'name' @ [76:67] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunctionButNotExport[LocalVariableDescriptor]

'expression' @ [76:73] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunctionButNotExport[ValueParameterDescriptorImpl]

'name' @ [79:16] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.declaration.FileDeclarationVisitor.addFunctionButNotExport[LocalVariableDescriptor]

