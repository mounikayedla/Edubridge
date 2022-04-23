import { Directive } from '@angular/core';

@Directive({
  selector: '[appStudentHighlight]'
})
export class StudentHighlightDirective {

  constructor(private el: ElementRef:) { }
  @HostListener('mouseenter') onMouseEnter() {
		this.highlight('gray');
	}

	@HostListener('mouseleave') onMouseLeave() {
		this.highlight('null');
	}

	private highlight(color: string) {
		this.el.nativeElement.style.backgroundColor = color;
	}
}

